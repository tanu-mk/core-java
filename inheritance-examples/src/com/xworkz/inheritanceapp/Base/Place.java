package com.xworkz.inheritanceapp.Base;

public class Place {
	
	
	public String cityName;
	public String district;
	public String state;
	
	public void toVisit(String cityName, String state ) {
		
		this.cityName = cityName;
		this.state = state;
		
		System.out.println(this.cityName);
		System.out.println(this.state);

}

}
