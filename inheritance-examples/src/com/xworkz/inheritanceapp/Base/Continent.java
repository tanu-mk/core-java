package com.xworkz.inheritanceapp.Base;

public class Continent {
	
	public String name;
	public String physicalFeatures;
	public String specialty;
	
	public void toUnderstandTheGeologyOfEarth(String name, String physicalFeatures) {
		
		this.name = name;
		this.physicalFeatures = physicalFeatures;
		
		System.out.println(this.name);
		System.out.println(this.physicalFeatures);
		
	}

}
