package com.server.cafeV.webapp.controller;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
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
import com.server.cafeV.webapp.exceptions.ResponseMessage;
import com.server.cafeV.webapp.model.DataBaseResponse;
import com.server.cafeV.webapp.model.EditData;
import com.server.cafeV.webapp.model.EditProperties;
import com.server.cafeV.webapp.model.EditProperty;
import com.server.cafeV.webapp.model.VForm;
import com.server.cafeV.webapp.service.YAMLServices;




@Controller
@CrossOrigin("http://localhost:3000")
public class VFormDataController {
	
	@Autowired
	private YAMLServices ym;
//	private DataBaseResponse DataBase;
	private String DataBase;
	
	@GetMapping
	@RequestMapping(path="/getData",produces="application/json")
	@ResponseBody
	public VForm welcome() {
			
			return this.ym.getVFormData(this.DataBase);
			
	}
	
	@PostMapping(path="/dataset")
	@RequestMapping(path="/dataset")
	@ResponseBody
	public ResponseEntity<ResponseMessage> postDataSet(@RequestBody String DataBase ){
	
		String message = "";
	try {
		
		this.DataBase = "";
				this.DataBase=DataBase.split("=")[0];
		//System.out.print(DataBase.getDataBase());
		message = "success";
		return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
	}catch(Exception e) {
		message = "failed";
		return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
	}

	}
	
	@PostMapping("/editData")
	@RequestMapping(path="/editData",consumes="application/json")
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
	
	
	@PostMapping("/setEditProperty")
	public String edit(@RequestBody String name){		
		this.ym.setEditProperty(name);;		
		return "redirect:/getEditProperty";

	}
	
	
	@GetMapping("/getEditProperty")
	@ResponseBody
	@RequestMapping(path="/getEditProperty",produces="application/json")
	public VForm getEditProperty() {			
			return this.ym.getEditProperty();			
	}
	
	@GetMapping
	@ResponseBody
	@RequestMapping(path="/getDataBase",produces="application/json")
	public VForm getDataBase() {
		this.DataBase = "";
			return this.ym.getDataBase();			
	}

}
