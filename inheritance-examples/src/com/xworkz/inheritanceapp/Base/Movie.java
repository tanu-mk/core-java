package com.xworkz.inheritanceapp.Base;

public class Movie {
	
	public String name;
	public int price;
	public String place;
	
	public void toHaveFun(String name, int price) {
		
		this.name = name;
		this.price = price;
		
		System.out.println(this.name);
		System.out.println(this.price);
		
	}

}
