package com.xworkz.inheritanceapp.Base;

public class Sweet {
	
	public String name;
	public String place;
	public int price;
	
	public void toTaste(String name, int price) {
		
		this.name = name;
		this.price = price;
		
		System.out.println(this.name);
		System.out.println(this.price);
	}

}
