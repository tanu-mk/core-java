package com.xworkz.inheritanceapp.Base;

public class Chocolate {
	
	public String name;
	public int price;
	public String benefits;
	public String barcodeId;
	
	public void forCooking(String name, String benefits) {
		
		this.name = name;
		this.benefits = benefits;
		
		System.out.println(this.name);
		System.out.println(this.benefits);
		
	}

}
