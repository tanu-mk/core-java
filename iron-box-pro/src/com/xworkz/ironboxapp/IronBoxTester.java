package com.xworkz.ironboxapp;

public class IronBoxTester {

	public static void main(String t[]) {
		
		IronBox.type = "Hot";
		
		IronBox box = new IronBox("GJD637", "Philips");
		
		System.out.println("Features of Iron Box");
		System.out.println(box.ironBoxId + " "+ box.name + " "+ IronBox.type );
		
       IronBox box1 = new IronBox("tehdf37", "Milton");
   		
       	System.out.println("Features of Iron Box");
		System.out.println(box1.ironBoxId + " "+ box1.name + " "+ IronBox.type );
		
		IronBox box2 = new IronBox("jsffb37", "Bajaj");
		
		System.out.println("Features of Iron Box");
		System.out.println(box2.ironBoxId + " "+ box2.name + " "+ IronBox.type );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}

