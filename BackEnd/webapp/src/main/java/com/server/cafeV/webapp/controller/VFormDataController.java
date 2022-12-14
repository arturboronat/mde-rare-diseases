package com.server.cafeV.webapp.controller;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.server.cafeV.webapp.exceptions.ResponseMessage;
import com.server.cafeV.webapp.model.EditData;
import com.server.cafeV.webapp.model.FormInputSearch;
import com.server.cafeV.webapp.model.GraphObject;
import com.server.cafeV.webapp.model.VForm;
import com.server.cafeV.webapp.service.StorageService;
import com.server.cafeV.webapp.service.StorageServiceImpl;
import com.server.cafeV.webapp.service.YAMLServices;





@Controller
@CrossOrigin("http://localhost:3000")
public class VFormDataController {
	
	@Autowired
	private YAMLServices ym;
	
	
	//Api for generating Form Data with YAMTL
	@GetMapping
	@ResponseBody
	@RequestMapping(path="/getFormData/{dataSet}")
	public VForm getFormData(@PathVariable String dataSet) throws IOException, URISyntaxException {						
		
		return this.ym.generateForm(dataSet);		
	}
	
	
	//Api for generating New Form Data with YAMTL
	@GetMapping
	@ResponseBody
	@RequestMapping(path="/newForm/{dataSet}")
	public List<String> newForm(@PathVariable String dataSet) throws IOException, URISyntaxException {								
		return this.ym.createNewForm(dataSet);		
	}
		
		
	@GetMapping
	@ResponseBody
	@RequestMapping(path="/getUiEditProperty/{dataSet}/{id}",produces="application/json")
	public VForm getuiEditProperty(@PathVariable String dataSet, @PathVariable String id) throws StreamReadException, DatabindException, IOException {			
		return ym.getUiEditProp(dataSet, id);	
	}
	
	
	@PostMapping
	@RequestMapping(path="/editFormData/{dataSet}")
	public ResponseEntity<ResponseMessage> editFormData(@RequestBody List<EditData> editData,@PathVariable String dataSet) throws StreamWriteException, DatabindException, IOException {					
		
		String message = "";
		ObjectMapper ob = new ObjectMapper();
		System.out.print(ob.writeValueAsString(editData));
		
		try {
			String dataPath = dataSet+"_edit";
			ym.editForm(editData, dataPath);
			message = "success ";
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
		}catch(Exception e) {
			message = "Fail ";
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
		}
		
		
	}
	
	@PostMapping
	@RequestMapping(path="/updateFormData/{dataSet}")
	public ResponseEntity<ResponseMessage> updateFormData(@RequestBody List<EditData> editData,@PathVariable String dataSet) throws StreamWriteException, DatabindException, IOException {					
		
		String message = "";
		ObjectMapper ob = new ObjectMapper();
		System.out.print(ob.writeValueAsString(editData));
		
		try {
			String dataPath = dataSet+"_create";
			ym.editForm(editData, dataPath);
			message = "success ";
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
		}catch(Exception e) {
			message = "Fail ";
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
		}
		
		
	}
	
	@GetMapping
	@ResponseBody
	@RequestMapping(path="/getDataBase",produces="application/json")
	public VForm getDataBase() {
		StorageService ss = new StorageServiceImpl();
		ss.init();
		VForm db = new VForm();
		FormInputSearch sch = new FormInputSearch();
		
		sch.setQueryClause(false);
		sch.setId("dataBase");
		sch.setInputType("search");
		sch.setInputName("dataBase");
		sch.setOptions(ss.getFiles());
		db.setFormLayout("vertical");
		db.formInputs.add(sch);
		
		return db;
	
		
	}
	
	//Api for generating Obsfucation of Data
		@GetMapping
		@ResponseBody
		@RequestMapping(path="/obsfucate/{dataSet}/{name}/{x}")
		public List<GraphObject> obsfucate(@PathVariable String dataSet, @PathVariable String name,@PathVariable Double x) throws IOException, URISyntaxException {						
			return ym.obsfucateData(dataSet, name,x);
			
		}
	
}
