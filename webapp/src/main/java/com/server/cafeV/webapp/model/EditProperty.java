package com.server.cafeV.webapp.model;

import java.util.List;

public class EditProperty {
	
	 
	private List<String> name;
	private List<String> types;
	private List<String> data;
	private List<String> min;
	private List<String> mean;
	private List<String> max;
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public List<String> getTypes() {
		return types;
	}
	public void setTypes(List<String> types) {
		this.types = types;
	}
	public List<String> getData() {
		return data;
	}
	public void setData(List<String> data) {
		this.data = data;
	}
	public List<String> getMin() {
		return min;
	}
	public void setMin(List<String> min) {
		this.min = min;
	}
	public List<String> getMean() {
		return mean;
	}
	public void setMean(List<String> mean) {
		this.mean = mean;
	}
	public List<String> getMax() {
		return max;
	}
	public void setMax(List<String> max) {
		this.max = max;
	}
}
