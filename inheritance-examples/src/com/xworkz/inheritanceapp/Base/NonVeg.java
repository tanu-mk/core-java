package com.xworkz.inheritanceapp.Base;

public class NonVeg {
	
	public String name;
	public int price;
	public String type;
	
	public void toEat(String name, int price) {
		
		this.name = name;
		this.price = price;
		
		System.out.println(this.name);
		System.out.println(this.price);
		
	}

}
