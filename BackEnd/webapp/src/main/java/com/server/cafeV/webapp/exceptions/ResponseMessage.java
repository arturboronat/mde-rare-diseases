package com.server.cafeV.webapp.exceptions;

public class ResponseMessage {
	
	 private String message;
	 
	 public ResponseMessage(String message) {
		 this.message = message;
	 }
	 
	 public String getMessage() {
		 return message;
	 }
	 
	 public void setMessage(String message) {
		 this.message = message;
	 }
}
