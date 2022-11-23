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
import com.server.cafeV.webapp.service.YAMLServices;




@RestController
@RequestMapping(path="/", produces="application/json")
@CrossOrigin("http://localhost:3000")
public class VFormDataController {
	
	@GetMapping("/getData")
	public VForm welcome() {
			
		YAMLServices ym = new YAMLServices();
			return ym.getVFormData("Rett_Datacleaned");
			
			
			
		
	}

}
