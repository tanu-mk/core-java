package com.xworkz.inheritanceapp.Base;

public class SocialMedia {

	public String name;
	public String id;
	public String type;
	
	public void toView(String name, String type) {
		
		this.name = name;
		this.type = type;
		
		System.out.println(this.name);
		System.out.println(this.type);
		
	
	}
	}