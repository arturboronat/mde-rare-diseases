package com.server.cafeV.webapp.model;

import java.util.ArrayList;
import java.util.List;

public class FormInputSearch extends FormInput {
	

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	private List<String> options;
	
	public FormInputSearch() {
		super();
		
	}
}
