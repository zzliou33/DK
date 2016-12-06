package com.hanbit.animal;

import org.apache.commons.lang3.StringUtils;

public abstract class Animal{

	public static final String DEFAULT_NAME = "무명";
	
	protected String name;
	protected final String kind;
	protected String color;
		
	public Animal(String name, String kind, String color) {
		this.name = name;
		this.kind = kind;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return name + " : " + kind + " : " + color;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (StringUtils.isBlank(name)) {
			name = getDafaultName();
		}
		
		this.name = name;
	}
	
	protected abstract String getDafaultName(); 
	
	public String getKind() {
		return kind;
	}
	
	public void setColor(String color) {
		if (StringUtils.isBlank(color)) {
			return;
		}
		
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	

}
