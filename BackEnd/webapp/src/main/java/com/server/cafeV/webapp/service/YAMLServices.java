package com.server.cafeV.webapp.service;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.server.cafeV.webapp.model.EditData;
import com.server.cafeV.webapp.model.EnumOption;
import com.server.cafeV.webapp.model.FormInputBasic;
import com.server.cafeV.webapp.model.FormInputSelect;
import com.server.cafeV.webapp.model.GraphObject;
import com.server.cafeV.webapp.model.VForm;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import csv_to_props.PropsCompiler;
import csv_to_vform.csv_to_vform;

@Service
public class YAMLServices {
	

	private VForm vFormDSL; 
//	private List<HashMap<String,List<String>>> uiEditProps;
//	private EditProperty uiEditProp;
	final csv_to_vform dc = new csv_to_vform();
	final PropsCompiler pc = new PropsCompiler(); 
	final ObjectMapper obm = new ObjectMapper();
	final String rootPath = (new File(this.dc.getClass().getProtectionDomain().
			 getCodeSource().getLocation().toURI())).getParentFile().
			 getParent()+"/src/main/resources/datasets/";;
	
	public YAMLServices() throws URISyntaxException {

		 
	}
	
//	public static void main(String[] args) throws IOException, URISyntaxException {
//		
//		YAMLServices yy = new YAMLServices();
//		ObjectMapper obj = new ObjectMapper();
//	
//	VForm vf = yy.getUiEditProp("Mock_data","subject_id");
//		
//		//don't edit
//		String out = obj.writeValueAsString(vf);
//		System.out.print(out);
//		
//		
//	}
	
	
	//This is an Service for retrieving the VForm Generated from the file System
	@SuppressWarnings("unchecked")
	public VForm generateForm(String DataSet) throws IOException, URISyntaxException {
		
			this.vFormDSL = new VForm();
			
		//Get Dataset Paths
			this.dc.compile(rootPath+DataSet);
			//include Error Handling
			this.pc.compile(rootPath+DataSet);
			//include Error Handling
			Path vfUrl = Paths.get(rootPath+DataSet+".vform");
			Path vfJson = Paths.get(rootPath+DataSet+".json");
			File vfPath = new File(rootPath+DataSet+".json");
			
				
			if(vfPath.exists()) {vfPath.delete();}
			
			Files.copy(vfUrl, vfJson);
		
//			this.uiEditProps = this.obm.readValue(this.propsPath, this.uiEditProps.getClass());	
			
			return this.obm.readValue(vfPath, this.vFormDSL.getClass());
		
	}
	

	
	//this is a method for generating the edit options for a given input entity it recieves a post request
	public HashMap<String,List<String>> setUiEditProp(String name, List<HashMap<String,List<String>>> props) {	
		
		HashMap<String,List<String>> prop = new HashMap<String,List<String>>();
		
		for(HashMap<String,List<String>> i:props) {
				if(i.get("name").get(0).equals(name)) {
					prop.put("name",i.get("name"));
					prop.put("types",i.get("types"));
					prop.put("groupName",i.get("groupName"));
					
				}
				
			}
		
		return prop;
		
	}
	
	//This is a method for creating new form
	@SuppressWarnings("unchecked")
	public List<String> createNewForm(String dataSet) throws StreamReadException, DatabindException, IOException {
		
		File propsPath = new File(rootPath+dataSet+"_props.json");
		
		List<HashMap<String,List<String>>> props = new ArrayList<HashMap<String,List<String>>>();
		
		
		props = this.obm.readValue(propsPath, props.getClass());
		
		List<String> names = new ArrayList<String>();
		
		for(HashMap<String,List<String>> i: props) {
			names.add(i.get("name").get(0));
		}

		return names;
	}
	
	
	//this is a method for retrieving the edit property for a given input entity
	@SuppressWarnings("unchecked")
	public VForm getUiEditProp(String dataSet, String name) throws StreamReadException, DatabindException, IOException {
		
		File propsPath = new File(rootPath+dataSet+"_props.json");
		
		List<HashMap<String,List<String>>> props = new ArrayList<HashMap<String,List<String>>>();
		
		
		props = this.obm.readValue(propsPath, props.getClass());
		
		HashMap<String,List<String>> prop = this.setUiEditProp(name, props);
		
		VForm vEdit = new VForm();
		FormInputBasic id_ = new FormInputBasic();
		id_.setId(prop.get("name").get(0));
		id_.setInputName(prop.get("name").get(0));
		id_.setInputType("disabled");
		id_.setQueryClause(false);
		
		FormInputBasic name_ = new FormInputBasic();
		name_.setInputType("text");
		name_.setId("name");
		name_.setInputName("name");
		name_.setQueryClause(false);

		FormInputSelect types = new FormInputSelect();
		types.setId("type");
		types.setInputName("type");
		types.setInputType("select");
		types.setQueryClause(false);
		
		EnumOption typesOption = new EnumOption();
		typesOption.setData(prop.get("types"));
		types.setOption(typesOption);

		
		vEdit.setFormLayout("vertical");		
		vEdit.formInputs.add(id_);
		vEdit.formInputs.add(name_);
		vEdit.formInputs.add(types);
		
		
		
		return vEdit;
	}
	
	
	//this is a method for editing the Vform Data
	@SuppressWarnings("unchecked")
	public void editForm(List<EditData> editData, String dataSet) throws StreamWriteException, DatabindException, IOException {
		
		File editJson = new File(this.rootPath+dataSet+".json");
		 if(editJson.exists()){editJson.delete();}		
		this.obm.writeValue(Paths.get(this.rootPath+dataSet+".json").toFile(), editData);
	}
	
	
	@SuppressWarnings("unchecked")
	public  List<GraphObject> obsfucateData(String dataSet, String name, Double x) throws StreamReadException, DatabindException, IOException{
		
	File propsPath = new File(rootPath+dataSet+"_props.json");		
	List<HashMap<String,List<String>>> props = new ArrayList<HashMap<String,List<String>>>();
	props = this.obm.readValue(propsPath, props.getClass());
	
	List<String> prop = new ArrayList<String>();
	List<Integer> propN = new ArrayList<Integer>();
	String std = "";
	
			
			for(HashMap<String,List<String>> i:props) {
					if(i.get("name").get(0).equals(name)) {
						prop = i.get("data");
						std = i.get("Std").get(0);
					}
				}
			prop.forEach(c->propN.add(Integer.parseInt(c)));
			DescriptiveStatistics d = new DescriptiveStatistics();
			for (int i: propN) {d.addValue(Double.valueOf(i));}	
			if(x<0) {
				x=1.00;
			}
			return obsfucate(propN, d.getMean(), d.getMax(), d.getMin(), x*d.getStandardDeviation());
		}
	
	
	
	
	public List<GraphObject> obsfucate(List<Integer> n, Double mean, Double max, Double min, Double std) {
		
		final DecimalFormat dform = new DecimalFormat("0.00");
		List<GraphObject> graph = new ArrayList<GraphObject>();
		Double count = mean;
				while(count<max) {
					count += std;
					Double upperBound = count;
					Double lowerBound = count - std;		
					GraphObject gob = new GraphObject();
					gob.setName(dform.format(lowerBound)+" - "+dform.format(upperBound)); 
					if(upperBound>= max){
						gob.setName("<"+dform.format(lowerBound));
					}
					gob.setValue((n.stream().filter(c-> Double.valueOf(c) >= lowerBound && Double.valueOf(c)  < upperBound ).collect(Collectors.toList()).size()/Double.valueOf(n.size()))*Double.valueOf(100));
					graph.add(gob);
					 
				}
				
				count = mean;
				var r = 1;
				while(count>min) {
					count -= std;					
					Double upperBound = count + std;					
					Double lowerBound = count;						
					GraphObject gob = new GraphObject();
					if(lowerBound<=min) {
						r = -0;
					}
					gob.setName(dform.format(lowerBound*r)+" - "+dform.format(upperBound));
					gob.setValue((n.stream().filter(c-> Double.valueOf(c) >= lowerBound && Double.valueOf(c)  < upperBound ).collect(Collectors.toList()).size()/Double.valueOf(n.size()))*Double.valueOf(100));
					graph.add(0,gob);
					
				}
				
		return graph;		
	}
}
