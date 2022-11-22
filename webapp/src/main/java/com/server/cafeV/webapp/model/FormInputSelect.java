package com.server.cafeV.webapp.model;

public class FormInputSelect extends FormInput{

	private Option options;

	public Option getOptions() {
		return options;
	}

	public void setOption(Option options) {
		this.options = options;
	}
	
	FormInputSelect(){
		super();
	}
}
