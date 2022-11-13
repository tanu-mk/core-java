package com.xworkz.ironboxapp;

public class IronBox {
	
	public String ironBoxId;
	public String name;
	public static String type;
	
	
	//Default constructor
	public IronBox() {
		
	}
	
	//parameterized constructor
	public IronBox(String id, String nm) {
		ironBoxId = id;
		name = nm;
	}
	
	public void toGetIroned() {
		
		System.out.println("To iron the cloths");
	}

}
