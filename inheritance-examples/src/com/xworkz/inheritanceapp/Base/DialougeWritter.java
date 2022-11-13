package com.xworkz.inheritanceapp.Base;

public class DialougeWritter {
	
	public String name;
	public String place;
	public String type;
	
	public void toWrite(String name, String type) {
		
		this.name = name;
		this.type = type;
		
		System.out.println(this.name);
		System.out.println(this.type);
	}

}
