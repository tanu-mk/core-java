package com.xworkz.inheritanceapp.Base;

public class Vegetable {
	
	public String name;
	public int price;
	public String shopName;
	public String shopAddress;
	
	public void toCook(String name, int price) {
		
		this.name = name;
		this.price = price;
		
		System.out.println(this.name);
		System.out.println(this.price);
		
	}

}
