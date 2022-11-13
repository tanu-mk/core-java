package com.xworkz.inheritanceapp.Base;

public class Color {
	
	public String name;
	public String place;
	public String type;
	
	public void toDifferentiate(String name, String type) {
		
		this.name = name;
		this.type = type;
		
		System.out.println(this.name);
		System.out.println(this.type);
		
	}

}
