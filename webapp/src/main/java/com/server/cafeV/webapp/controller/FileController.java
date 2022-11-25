package com.server.cafeV.webapp.controller;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.server.cafeV.webapp.exceptions.ResponseMessage;
import com.server.cafeV.webapp.model.FileResponse;
import com.server.cafeV.webapp.service.StorageService;


@Controller
@CrossOrigin("http://localhost:3000")
public class FileController {
	
	@Autowired
	private  StorageService storageService;

	@PostMapping("/upload")
	public ResponseEntity<ResponseMessage> uploadfile(@RequestParam("file") MultipartFile file){
		String message = "";
		
		try {
			storageService.store(file);
			message = "Uploaded the file successfully "+file.getOriginalFilename();
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
		}catch(Exception e) {
			message = "Could not upload the file: "+ file.getOriginalFilename()	;
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
		}
	}
	
	@PostMapping("/delete")
	public ResponseEntity<ResponseMessage> deleteFile(@RequestParam("data") String data){
		String message = "";
		
		try {
			storageService.delete(data);
			message = "Deleted the file successfully "+data;
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
		}catch(Exception e) {
			message = "Could not delete the file: "+ data;
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
		}
	}
	

	@GetMapping("/files")
	@ResponseBody
	public List<String> getFiles() {
		
		return storageService.getFiles();

//		Resource file = storageService.load(fileName);
//		String contentType = null;
//		
//		try {
//			contentType = request.getServletContext().getMimeType(file.getFile().getAbsolutePath());
//		}catch(IOException ex) {
//			System.out.println("Could not determine fileType");
//		}
//		
//		if(contentType==null) {
//			contentType = "application/octet-stream";
//		}

		
	}
}
