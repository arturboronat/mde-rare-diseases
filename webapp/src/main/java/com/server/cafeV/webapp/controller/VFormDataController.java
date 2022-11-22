package com.server.cafeV.webapp.controller;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.server.cafeV.webapp.model.VForm;




@RestController
@RequestMapping(path="/", produces="application/json")
@CrossOrigin("http://localhost:3000")
public class VFormDataController {
	
	@GetMapping("/getData")
	public String welcome() {
//		ArrayList<VForm> vff = new ArrayList<VForm>();
		
		
		String json = "";
		
		try {
			File fileUrl = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI());
			json = fileUrl.getParentFile().getParentFile().getParent()+"/webapp/src/main/resources/newFile.Json";
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		VForm vfM = new VForm();
		ObjectMapper objectMapper = new ObjectMapper();
		
			try {
				
				VForm vf = objectMapper.readValue(new File(json), vfM.getClass());
				

				return objectMapper.writeValueAsString(vf);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			return null;
			
			
			
		
	}

}
