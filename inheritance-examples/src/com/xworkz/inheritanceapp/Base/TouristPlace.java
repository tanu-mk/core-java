package com.xworkz.inheritanceapp.Base;

public class TouristPlace {

	public String name;
	public String location;
	public String state;
	
	public void toEnjoy(String name, String location) {
		
		this.name = name;
		this.location = location;
		
		System.out.println(this.name);
		System.out.println(this.location);
		
	}
}
