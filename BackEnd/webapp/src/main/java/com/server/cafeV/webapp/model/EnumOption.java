package com.server.cafeV.webapp.model;

import java.util.List;

public class EnumOption extends Option{

	public List<String> getData() {
		return data;
	}
	
	public void setData(List<String> data) {
		this.data = data;
	}
		private List<String>data;
		
	public EnumOption() {
		
		super();
	}
}
