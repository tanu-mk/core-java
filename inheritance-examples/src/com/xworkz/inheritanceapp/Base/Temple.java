package com.xworkz.inheritanceapp.Base;

public class Temple {
	
	public String name;
	public String place;
	public String state;
	
	public void toWorkship(String name, String place) {
		
		this.name = name;
		this.place = place;
		
		System.out.println(this.name);
		System.out.println(this.place);
		
	}

}
