package com.xworkz.inheritanceapp.Base;

public class PetrolBunk {
	
	public String name;
	public String location;
	public int price;
	
	public void toProvideFuel(String name, int price) {
		
		this.name = name;
		this.price = price;
		
		System.out.println(this.name);
		System.out.println(this.price);
		
	}

}
