package com.server.cafeV.webapp.controller;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.server.cafeV.webapp.model.EditData;
import com.server.cafeV.webapp.model.VForm;
import com.server.cafeV.webapp.service.YAMLServices;




@Controller
@CrossOrigin("http://localhost:3000")
public class VFormDataController {
	
	@Autowired
	private YAMLServices ym;
	
	@GetMapping
	@RequestMapping(path="/getData",produces="application/json")
	@ResponseBody
	public VForm welcome() {
			
			return this.ym.getVFormData("Rett_Datacleaned");
			
	}
	
	@PostMapping("/edit")
	@RequestMapping(path="/edit",consumes="application/json")
	public String edit(@RequestBody EditData editdata){
		
		this.ym.editVForm(editdata);
		
		return "redirect:/getEditedData";

	}
	
	
	@GetMapping("/getEditedData")
	@ResponseBody
	@RequestMapping(path="/getEditedData",produces="application/json")
	public VForm getEditedData() {
			
			return this.ym.getEditedData();
			
	}
}