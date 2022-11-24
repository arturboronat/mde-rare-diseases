package com.server.cafeV.webapp.service;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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
import com.server.cafeV.webapp.model.FormInput;
import com.server.cafeV.webapp.model.FormInputBasic;
import com.server.cafeV.webapp.model.VForm;

import csv_to_props.PropsCompiler;
import yamtlDataset.DatasetCompiler;

@Service
public class YAMLServices {
	

	private VForm vFormDSL; 
	private	File  vfPath;
	private File propsPath;
	private List<EditProperty> editProperties;
	private EditProperty editProperty;
	
	public YAMLServices() {
		this.vFormDSL = new VForm();
		this.editProperties = new ArrayList<EditProperty>();
		this.editProperty = new EditProperty();
	}
	
//	public static void main(String[] args) {
//		
//		YAMLServices yy = new YAMLServices();
//		
//		//VForm vd = new VForm();
//		
//		yy.getVFormData("Mock_data");
//		EditData edd = new EditData();
//		edd.setName("combo");
//		edd.setType("search");
//		yy.editVForm(edd);		
//		FormInput fd = new FormInputBasic();
//		
//		fd.setInputName("myText");
//		fd.setInputType("text");
//		
//		FormInput fd2 = new FormInputBasic();
//		fd2.setInputName("myChck");
//		fd2.setInputType("checkbox");
//		
//		FormInput fd3 = new FormInputBasic();
//		fd3.setInputName("myNumber");
//		fd3.setInputType("number");
//		
//		EditData edd = new EditData();
//		edd.setName("myText");
//		edd.setType("checkbox");
//		
//		vd.formInputs.add(fd);
//		vd.formInputs.add(fd2);
//		vd.formInputs.add(fd2);
		//yy.editVForm(edd,vd);
//		
//		
//		ObjectMapper obj = new ObjectMapper();
//		
//		try {
//			System.out.print(obj.writeValueAsString(yy.editVForm(edd)));
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
	
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
		
		for(EditProperty i: this.editProperties) {
			if(i.getName().equals(name)) {
				this.editProperty = i;
			}
		}
		
	}
	
	public EditProperty getEditProperty() {
		
		return this.editProperty;
	}
	

}
