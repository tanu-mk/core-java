package com.xworkz.inheritanceapp.Base;

public class Documentary {
	
	public String name;
	public String movie;
	
	public void toWatch(String name) {
		
		this.name = name;
		
		System.out.println(this.name);
	}

}
