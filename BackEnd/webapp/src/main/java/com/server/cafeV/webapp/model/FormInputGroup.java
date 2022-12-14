package com.server.cafeV.webapp.model;

import java.util.List;


public class FormInputGroup extends FormInput{
	
	FormInputGroup(){
		super();
	}

	private List<FormInput> groupInputs;

	public List<FormInput> getGroupInputs() {
		return groupInputs;
	}

	public void setGroupInputs(List<FormInput> groupInputs) {
		this.groupInputs = groupInputs;
	}


}
