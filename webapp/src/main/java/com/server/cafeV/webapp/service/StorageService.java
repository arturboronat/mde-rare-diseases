package com.server.cafeV.webapp.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;


public interface StorageService {

	
	
	public void init();
	
	public void store(MultipartFile file);
	
	public Resource load(String fileName);
	
	public String [] getFiles();
	
	public void delete(String data);
	
	public Stream<Path>loadAll();
	
	
}

