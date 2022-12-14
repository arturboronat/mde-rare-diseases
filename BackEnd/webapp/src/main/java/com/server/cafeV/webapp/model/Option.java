package com.server.cafeV.webapp.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@JsonTypeInfo(
use = JsonTypeInfo.Id.NAME,
include = JsonTypeInfo.As.PROPERTY,
property = "optionType")
@JsonSubTypes({
	@Type(value=EnumOption.class, name="enum")
})
public abstract class Option {
	
}
