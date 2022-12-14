package com.server.cafeV.webapp;


import java.net.URL;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.server.cafeV.webapp.service.StorageService;


@SpringBootApplication
public class WebappApplication implements CommandLineRunner{
	@Resource
	StorageService storageService;
	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
			
	}	
	
	@Override
	public void run(String... arg) throws Exception {
			//storageService.deleteAll();
			storageService.init();
		}
}


