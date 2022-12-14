package com.server.cafeV.webapp.model;

import java.util.List;

public class JsonPropNumerical extends JsonProp{
	private List<Integer> data;
	private List<Integer> Min;
	private List<Integer> Max;
	private List<Integer> Std;
	private List<Integer> Mean;
	public List<Integer> getData() {
		return data;
	}
	public void setData(List<Integer> data) {
		this.data = data;
	}
	public List<Integer> getMin() {
		return Min;
	}
	public void setMin(List<Integer> min) {
		Min = min;
	}
	public List<Integer> getMax() {
		return Max;
	}
	public void setMax(List<Integer> max) {
		Max = max;
	}
	public List<Integer> getStd() {
		return Std;
	}
	public void setStd(List<Integer> std) {
		Std = std;
	}
	public List<Integer> getMean() {
		return Mean;
	}
	public void setMean(List<Integer> mean) {
		Mean = mean;
	}

}
