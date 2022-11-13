package com.xworkz.inheritanceapp.Base;

public class HumanBeing {

	public String name;
	public int contactNo;
	public String location;
	
	public void toLiveAndLetLive(String name , String location) {
		
		this.name = name;
		this.location = location;
		
		System.out.println(this.name);
		System.out.println(this.location);
		
	}
}
