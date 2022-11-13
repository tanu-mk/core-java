package com.xworkz.inheritanceapp.Base;

public class Wood {
	
	public String name;
	public String type;
	public int price;
	
	public void toProvideSafety(String name, int price) {
		
		this.name = name;
		this.price = price;
		
		System.out.println(this.name);
		System.out.println(this.price);
	}

}
