package com.server.cafeV.webapp.model;

import java.util.List;

import org.springframework.lang.Nullable;

public class EditData {
	
	private String id;
	private String name;
	private String type;
	private List<String> data;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<String> getData() {
		return data;
	}
	public void setData(List<String> data) {
		this.data = data;
	}

	

}
