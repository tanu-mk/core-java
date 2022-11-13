package com.xworkz.inheritanceapp.Base;

public class Flower {
	
	public String name;
	public String color;
	public int price;
	
	public void toDecorate(String name, String color) {
		
		this.name = name;
		this.color = color;
		
		System.out.println(this.name);
		System.out.println(this.color);
	}

}
