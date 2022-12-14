package com.server.cafeV.webapp.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.lang.Nullable;

public class VForm {
	
	
	private String formLayout;
	
	public VForm() {
		
		this.formInputs = new ArrayList<FormInput>();
	}
	
	public List<FormInput> formInputs;
	
	
	public String getFormLayout() {
		return formLayout;
	}
	public void setFormLayout(String formLayout) {
		this.formLayout = formLayout;
	}
	public List<FormInput> getFormInputs() {
		return formInputs;
	}
	public void setFormInputs(List<FormInput> formInputs) {
		this.formInputs = formInputs;
	}

	
}


