package com.server.cafeV.webapp.service;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.server.cafeV.webapp.model.VForm;

import yamtlDataset.DatasetCompiler;

public class YAMLServices {
	
	
	public VForm getVFormData(String DataSet) {
		
		DatasetCompiler dc = new DatasetCompiler();
		String VfObj = "";
		try {
			File fileUrl = new File(dc.getClass().getProtectionDomain().getCodeSource().getLocation().toURI());
			String newUrl = fileUrl.getParentFile().getParent()+"/src/main/resources/datasets/"+DataSet;
			dc.compile(newUrl);
			Path vfUrl = Paths.get(newUrl+".vform");
			Path vfJson = Paths.get(newUrl+".json");
			VfObj = newUrl+".json";
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
		
		VForm vfM = new VForm();
		ObjectMapper objectMapper = new ObjectMapper();
		
			try {
				
				VForm vf = objectMapper.readValue(new File(VfObj), vfM.getClass());
				

				return vf;
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			return null;
	
		
	}
	
	

}
