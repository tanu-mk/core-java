package com.xworkz.encapsulationapp;

import com.xworkz.encapsulationapp.classfiles.BakeryDTO;

public class BakeryTester {
	
	public static void main(String t[]) {
		
		
		BakeryDTO bakery  = new BakeryDTO();
			bakery.setBakeryName("Sri Krishna Bakery");
			System.out.println(bakery.getBakeryName());
			
			bakery.setBakeryPlace("Marathahalli");
			System.out.println(bakery.getBakeryPlace());
			
			
	}

}
