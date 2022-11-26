package com.server.cafeV.webapp.service;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;



@Service
public class StorageServiceImpl implements StorageService{
	
	
	private  Path rootLocation;
	

	@Override
	public void init() {
		try {
			File fileUrl = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI());
			this.rootLocation = Paths.get(fileUrl.getParentFile().getParentFile().getParent()+"/cafev.vform.parent/cafev.vform/src/main/resources/datasets");
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}


	@Override
	public void  store(MultipartFile file) {

		File newFile = new File(this.rootLocation+file.getOriginalFilename());
		
		
		try {
			
			Files.copy(file.getInputStream(), this.rootLocation.resolve(file.getOriginalFilename()));
			}catch(IOException e) {
				
				throw new RuntimeException("Could not store file Error"+ e.getMessage());
			}
			
	}
	
	@Override
	public List<String> getFiles(){
		
		File allFiles = new File(this.rootLocation.toString());
		
		List<String> csv = new ArrayList<String>();
		
		for (String i:allFiles.list()) {
			if(i.endsWith(".csv")) {csv.add(i);}
		}
		return csv;
		
	}

	@Override
	public Resource load(String fileName) {
		try {
			Path file = this.rootLocation.resolve(fileName);
			Resource resource = new UrlResource(file.toUri());
			if (resource.exists()||resource.isReadable()) {
				return resource;
			}
			else {
				throw new RuntimeException("Could Not Read File");

			}
		}
		catch (MalformedURLException e) {
			throw new RuntimeException("Error: " + e.getMessage());
		}
	}
	
	@Override
	public void delete(String data) {
		File delFile = new File(this.rootLocation.toString()+data);
		
		if(delFile.delete()) {
			System.out.print("deleted successfulley");
		}else {
			System.out.print("not deleted successfulley");
		}
	}
	
	
	@Override
	public Stream<Path> loadAll() {
		try {
			return Files.walk(this.rootLocation, 1)
				.filter(path -> !path.equals(this.rootLocation))
				.map(this.rootLocation::relativize);
		}
		catch (IOException e) {
			throw new RuntimeException("Could Not Load files");
		}

	}

}
