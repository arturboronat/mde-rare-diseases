package com.server.cafeV.webapp.model;

import org.springframework.lang.Nullable;

public class EditData {
	
	private String id_;
	
	@Nullable
	private String name;
	@Nullable
	private String type;
//	@Nullable
//	private String groupName;
	
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
//	public String getGroupName() {
//		return groupName;
//	}
//	public void setGroupName(String groupName) {
//		this.groupName = groupName;
//	}
	public String getId_() {
		return id_;
	}
	public void setId_(String id_) {
		this.id_ = id_;
	}

}
