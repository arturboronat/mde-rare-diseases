package com.server.cafeV.webapp.model;

import java.util.ArrayList;
import java.util.List;

public class FormInputSearch extends FormInput {
	

	public List<String> getData() {
		return data;
	}

	public void setData(List<String> data) {
		this.data = data;
	}

	private List<String> data;
	
	public FormInputSearch() {
		super();
		this.data = new ArrayList<String>();
		
	}
}
