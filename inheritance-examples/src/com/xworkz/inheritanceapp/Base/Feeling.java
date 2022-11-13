package com.xworkz.inheritanceapp.Base;

public class Feeling {
	
	public String name;
	public String place;
	public int price;
	
	public void toRide(String name, int price) {
		
		this.name = name;
		this.price = price;
		
		System.out.println(this.name);
		System.out.println(this.price);
	}
}
