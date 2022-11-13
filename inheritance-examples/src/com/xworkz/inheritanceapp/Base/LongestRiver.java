package com.xworkz.inheritanceapp.Base;

public class LongestRiver {
	
	public String name;
	public String place;
	public String country;
	
	public void forInformation(String name, String country) {
		
		this.name = name;
		this.country = country;
		
		System.out.println(this.name);
		System.out.println(this.country);
		
	}

}
