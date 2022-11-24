package com.server.cafeV.webapp.service;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.server.cafeV.webapp.WebappApplication;
import com.server.cafeV.webapp.model.EditData;
import com.server.cafeV.webapp.model.FormInput;
import com.server.cafeV.webapp.model.FormInputBasic;
import com.server.cafeV.webapp.model.VForm;

import yamtlDataset.DatasetCompiler;

@Service
public class YAMLServices {
	

	private VForm vFormDSL; 
	private	File  VfObj;
	
	public YAMLServices() {
		this.vFormDSL = new VForm();
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
	
	public VForm getVFormData(String DataSet) {
		
		DatasetCompiler dc = new DatasetCompiler();
		
		try {
			File fileUrl = new File(dc.getClass().getProtectionDomain().getCodeSource().getLocation().toURI());
			String newUrl = fileUrl.getParentFile().getParent()+"/src/main/resources/datasets/"+DataSet;
			dc.compile(newUrl);
			Path vfUrl = Paths.get(newUrl+".vform");
			Path vfJson = Paths.get(newUrl+".json");
			this.VfObj = new File(newUrl+".json");
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

				this.vFormDSL = objectMapper.readValue(VfObj, this.vFormDSL.getClass());
				
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
	

}
