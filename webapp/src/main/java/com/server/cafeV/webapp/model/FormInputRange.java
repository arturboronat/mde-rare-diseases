package com.server.cafeV.webapp.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public class FormInputRange extends FormInput {


private int max;
private int min;


public int getMax() {
	return max;
}

public void setMax(int max) {
	this.max = max;
}

public int getMin() {
	return min;
}

public void setMin(int min) {
	this.min = min;
}


public FormInputRange() {
	
	super();

}

}
