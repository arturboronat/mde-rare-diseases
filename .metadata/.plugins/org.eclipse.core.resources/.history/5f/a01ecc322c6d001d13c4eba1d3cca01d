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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
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
	

	private VForm vFormDSL; 
	private	File  vfPath;
	private File propsPath;
	private List<HashMap<String,List<String>>> editProperties;
	private EditProperty editProperty;
	
	public YAMLServices() {
		this.vFormDSL = new VForm();
		this.editProperties = new ArrayList<HashMap<String,List<String>>>();
		this.editProperty = new EditProperty();
	}
	
//	public static void main(String[] args) {
//		
//		YAMLServices yy = new YAMLServices();
//		ObjectMapper obj = new ObjectMapper();
//	//	VForm vff = new VForm();
//		
//		VForm vff = yy.getVFormData("Mock_data");
//		
//		yy.setEditProperty("subject_id");
//		
//		VForm ed  = yy.getEditProperty();
//		
//		try {
//			String op = obj.writeValueAsString(ed);
//			System.out.print(op);
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		
//	}
//	
	@SuppressWarnings("unchecked")
	public VForm getVFormData(String DataSet) {
		
		DatasetCompiler dc = new DatasetCompiler();
		PropsCompiler pc = new PropsCompiler();
		
		
		try {
			File fileUrl = new File(dc.getClass().getProtectionDomain().getCodeSource().getLocation().toURI());
			String newUrl = fileUrl.getParentFile().getParent()+"/src/main/resources/datasets/"+DataSet;
			dc.compile(newUrl);
			pc.compile(newUrl);
			Path vfUrl = Paths.get(newUrl+".vform");
			Path vfJson = Paths.get(newUrl+".json");
			this.vfPath = new File(newUrl+".json");
			this.propsPath = new File(newUrl+"_props.json");
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
		
		ObjectMapper objectMapper = new ObjectMapper();
		
			try {
				
				this.editProperties = objectMapper.readValue(propsPath, this.editProperties.getClass());
				this.vFormDSL = objectMapper.readValue(vfPath, this.vFormDSL.getClass());
				
				return this.vFormDSL;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			return null;
	
		
	}
	
	public void editVForm(EditData editdata) {
			
		for(FormInput i: this.vFormDSL.formInputs) {
			
			if(i.inputName.equals(editdata.getName())) {
				System.out.print((i.inputName));
				i.inputType = editdata.getType();
				
				
			}
			
			
		}
		
	
	}
	
	public VForm getEditedData() {
		return this.vFormDSL;
	}
	
	public void setEditProperty(String name) {
		
		for(HashMap<String,List<String>> i:this.editProperties) {
			if(i.get("name").get(0).equals(name)) {
				this.editProperty.setTypes(i.get("types"));
				this.editProperty.setName(i.get("name").get(0));
				this.editProperty.setId(i.get("name").get(0));
				
			}
			
		}
		
	}
	
	public VForm getEditProperty() {
		
		VForm vEdit = new VForm();
		FormInputBasic name = new FormInputBasic();
		FormInputBasic id = new FormInputBasic();
		FormInputSelect types = new FormInputSelect();
		EnumOption typesOption = new EnumOption();
		typesOption.setData(this.editProperty.getTypes());
		name.setInputName(this.editProperty.getId());
		name.setInputType("checkbox");
		id.setInputName("name");
		id.setInputType("text");
		types.setInputName("inputTypes");
		types.setInputType("select");
		types.setOption(typesOption);
		vEdit.setFormLayout("vertical");
		vEdit.formInputs.add(name);
		vEdit.formInputs.add(id);
		vEdit.formInputs.add(types);
		
		
		
		return vEdit;
	}
	

}
