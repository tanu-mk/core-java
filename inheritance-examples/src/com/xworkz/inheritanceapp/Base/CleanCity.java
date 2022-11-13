package com.xworkz.inheritanceapp.Base;

public class CleanCity {
	
	public String cityName;
	public String district;
	public String state;
	
	public void toReducePollution(String cityName, String state ) {
		
		this.cityName = cityName;
		this.state = state;
		
		System.out.println(this.cityName);
		System.out.println(this.state);
		
	}

}
