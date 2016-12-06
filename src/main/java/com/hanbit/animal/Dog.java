package com.hanbit.animal;

import org.apache.commons.lang3.StringUtils;

public class Dog {
	
	private static final String DEFAULT_NAME = "멍멍이";
	
	private String name;
	private final String kind;
	//final은 선언할때 초기화하던지 
	//생성자에서 초기화하던지 그이후로는 변경불가
	private String color;
	
	public Dog(String kind, String color) {
		this(DEFAULT_NAME, kind, color);
	}
	
	public Dog(String name, String kind, String color) {
		this.name = name;
		this.kind = kind;
		this.color = color;
	}
	public String toString(){
		return name + " : " + kind+ " : "  + color;
	}
	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		if(StringUtils.isBlank(name)) {
			name = DEFAULT_NAME;
		}
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public String getColor() {
		return color;
	}	
	public void setColor(String color) {
		if(StringUtils.isBlank(color)) {
			return;
		}
		this.color = color;
	}

}
