package com.xworkz.overloadingapp.conceptoverloading;

public class Market {
	
	public int id;
	public String name;
	public String place;
	public String vegetables[] = new String[8];
	
	public Market() {
		
		System.out.println("Default constructor is called");
	}
	
	public Market(String vegetables[]) {
		
		this(2536, "K R Market", "Shivajinagar", vegetables);
		
		System.out.println("One parameterized constructor is called");
	}
	
	public Market(int id, String name, String place, String vegetables[]) {
		
		this();
		
		System.out.println("Calling 4 Parameterized constructor");
		
		this.id = id;
		this.name = name;
		this.place = place;
		this.vegetables = vegetables;
	}
	
	public void toPurchaseVegetables() {
		
		System.out.println("toPurchaseVegetables() is called");
		
		System.out.println("List of vegetables in "+ this.name);
		for(int i=0; i<vegetables.length; i++) {
			System.out.println(vegetables[i]);
		}
		
	}
	
	
	
	
	
	
	
}
