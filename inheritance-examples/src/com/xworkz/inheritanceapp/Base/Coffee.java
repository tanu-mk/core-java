package com.xworkz.inheritanceapp.Base;

public class Coffee {
	
	public String name;
	public int price;
	public String expiryDate;
	
	public void mentalAlertness(String name, int price) {
		
		this.name = name;
		this.price = price;
		
		System.out.println(this.name);
		System.out.println(this.price);
	}

}
