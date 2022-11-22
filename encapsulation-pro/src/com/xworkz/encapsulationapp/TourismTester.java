package com.xworkz.encapsulationapp;

import com.xworkz.encapsulationapp.classfiles.TourismDTO;

public class TourismTester {
	
	public static void main(String t[]) {
		
		TourismDTO tourism = new TourismDTO();
		tourism.setTourismName("Bellur and Halebidu");
		System.out.println(tourism.getTourismName());
		
		tourism.setNoOfPlacesCovered(7);
		System.out.println(tourism.getNoOfPlacesCovered());
		
		
		
		
		
	}

}
