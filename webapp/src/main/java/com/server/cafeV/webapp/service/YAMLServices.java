package com.server.cafeV.webapp.service;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.server.cafeV.webapp.WebappApplication;
import com.server.cafeV.webapp.model.EditData;
import com.server.cafeV.webapp.model.EditProperties;
import com.server.cafeV.webapp.model.EditProperty;
import com.server.cafeV.webapp.model.EnumOption;
import com.server.cafeV.webapp.model.FormInput;
import com.server.cafeV.webapp.model.FormInputBasic;
import com.server.cafeV.webapp.model.FormInputSelect;
import com.server.cafeV.webapp.model.VForm;

import csv_to_props.PropsCompiler;
import yamtlDataset.DatasetCompiler;

@Service
public class YAMLServices {
	
	private  StorageServiceImpl storageService;
	private VForm vFormDSL; 
	private	File  vfPath;
	private File propsPath;
	private List<HashMap<String,List<String>>> editProperties;
	private EditProperty editProperty;
	private ObjectMapper objectMapper;
	private DatasetCompiler dc ;
	private PropsCompiler pc = new PropsCompiler();
	private VForm vFc;
	
	public YAMLServices() {
		this.vFormDSL = new VForm();
		this.editProperties = new ArrayList<HashMap<String,List<String>>>();
		this.editProperty = new EditProperty();
		this.storageService = new StorageServiceImpl();
		this.objectMapper = new ObjectMapper();
		this.dc = new DatasetCompiler();
		this.pc = new PropsCompiler();
		this.vFc = new VForm();
	}
	
	public static void main(String[] args) {
		
		YAMLServices yy = new YAMLServices();
		ObjectMapper obj = new ObjectMapper();
		
		VForm ed  = yy.getVFormData("Mock_data");
		
		try {
			System.out.print(obj.writeValueAsString(ed));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@SuppressWarnings("unchecked")
	public VForm getVFormData(String DataSet) {
		try {
			File fileUrl = new File(this.dc.getClass().getProtectionDomain().getCodeSource().getLocation().toURI());
			String newUrl = fileUrl.getParentFile().getParent()+"/src/main/resources/datasets/"+DataSet;
			
			Path vfUrl = Paths.get(newUrl+".vform");
			Path vfJson = Paths.get(newUrl+".json");
			this.vfPath = new File(newUrl+".json");
			this.propsPath = new File(newUrl+"_props.json");
			if(vfPath.exists()) {
				try {
					return this.objectMapper.readValue(vfPath, this.vFormDSL.getClass());
				} catch (StreamReadException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (DatabindException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			this.dc.compile(newUrl);
			this.pc.compile(newUrl);
			try {
				Files.copy(vfUrl, vfJson);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
			try {
				
				
				this.vFormDSL = this.objectMapper.readValue(vfPath, this.vFormDSL.getClass());
				
				return generateForm();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			return null;
	
		
	}
	
	public VForm generateForm() {
		VForm vf = new VForm();
		List<FormInput> lfm = new ArrayList();
		
		for(HashMap<String,List<String>> i:  this.editProperties) {
			String name = i.get("name").get(0);
			String type = i.get("types").get(0);
			Stream<FormInput> fm = this.vFormDSL.formInputs.stream().
					filter(itm->itm.inputName.equals(name));
					
			
			
			
		}
		
		vf.setFormLayout("horizontal");
		vf.setFormInputs(lfm);
		
		return vf;
	}
	
	public void editVForm(EditData editdata) {
		
		
		for(FormInput i: this.vFormDSL.formInputs) {
			
			if(i.id.equals(editdata.getId_())) {
//			System.out.print((i.inputName));
				if(editdata.getName()!=null) {
					
				}
				if(editdata.getType()!=null) {
					i.setInputType(editdata.getType());
				}	
			}
			
			
		}
		
	
	}
	
	public VForm getEditedData() {
		return this.vFormDSL;
	}
	
	@SuppressWarnings("unchecked")
	public void setEditProperty(String name) {
		try {
			this.editProperties = this.objectMapper.readValue(propsPath, this.editProperties.getClass());
		} catch (StreamReadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(HashMap<String,List<String>> i:this.editProperties) {
			if(i.get("name").get(0).equals(name)) {
				this.editProperty.setTypes(i.get("types"));
				this.editProperty.setName(i.get("name").get(0));
				this.editProperty.setId(i.get("name").get(0));
				
			}
			
		}
		
	}
	
	public VForm getEditProperty() {
		
		FormInputBasic name = new FormInputBasic();
		FormInputBasic id = new FormInputBasic();
		FormInputSelect types = new FormInputSelect();
		EnumOption typesOption = new EnumOption();
		
		VForm vEdit = new VForm();
		
		typesOption.setData(this.editProperty.getTypes());
		name.setInputName(this.editProperty.getName());
		name.setInputType("disabled");
		id.setInputName("name");
		id.setId("name");
		name.setId(this.editProperty.getName());
		id.setInputType("text");
		types.setId("type");
		types.setInputName("type");
		types.setInputType("select");
		types.setOption(typesOption);
		vEdit.setFormLayout("vertical");
		
		List<FormInput> fm = new ArrayList<FormInput>();
		
		fm.add(name);
		fm.add(id);
		fm.add(types);
		vEdit.setFormInputs(fm);
		return vEdit;
	}
	
	public VForm getDataBase() {
		
		VForm vEdit = new VForm();
		FormInputSelect dataBase = new FormInputSelect();
		EnumOption options = new EnumOption();
		List<String> data = new ArrayList<String>();
		
		for(String i: this.storageService.getFiles()) {

			data.add(i.replaceFirst(".csv", ""));
		}		
		options.setData(data);
		dataBase.setInputName("DataBase");
		dataBase.setId("DataBase");
		dataBase.setInputType("select");
		dataBase.setOption(options);
		dataBase.setQueryClause(false);
		vEdit.setFormLayout("vertical");
		vEdit.formInputs.add(dataBase);		
		return vEdit;
	}
}
