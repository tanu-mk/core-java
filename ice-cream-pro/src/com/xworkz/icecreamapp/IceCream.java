package com.xworkz.icecreamapp;

public class IceCream {
	
	public String name;
	public String colour;
	public String flavour;
    public static String quantity;
	public int price;
	
	public IceCream() {
		
	}
	
	//Parameterized constructor
	public IceCream(String nm, String clr, String flvr, int pr) {
		name = nm;
		colour = clr;
		flavour = flvr;
		price = pr;
		
	}
	
	public void toChill() {
		
		System.out.println("To keep cool");
	}

}

	
	
	
	


