package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.Base.CleanCity;

public class CleanCityTester {
	
	public static void main(String t[]) {
	
	CleanCity city = new CleanCity();
	city.toReducePollution("Mangalore", "Karnataka");
	
	CleanCity city4 = new CleanCity();
	city4.toReducePollution("Coimbatore", "Kerala");
	
	
}
}
