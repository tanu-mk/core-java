package com.xworkz.inheritanceapp.Base;

public class Organ {
	
	public String name;
	public String type;
	
	public void toOrganiseTheBody(String name) {
		
		this.name  = name;
		
		System.out.println(this.name);
	}

}
