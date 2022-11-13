package com.xworkz.inheritanceapp.Base;

public class Ecommerce {
	
	public String name;
	public String category;
	public int price;
	
	public void forShopping(String category, int price) {
		
		this.category = category;
		this.price = price;
		
		System.out.println(this.category);
		System.out.println(this.price);
		
	}

}
