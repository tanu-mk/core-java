package com.xworkz.softdrinksapp;

public class SoftDrinks {
	
	public String softDrinksId;
	public String name;
	public String flavouring;
	static public String quantity;
	public int price;
	
	public SoftDrinks() {
		
	}
	
	public SoftDrinks(String id, String nm, String flvr, int pr) {
		softDrinksId = id;
		name = nm;
		flavouring = flvr;
		price = pr;
		
	}
	
	public void toChill() {
		
		System.out.println("Implying a healthier");
	}

}
