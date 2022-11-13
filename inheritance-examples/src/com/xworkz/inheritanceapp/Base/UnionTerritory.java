package com.xworkz.inheritanceapp.Base;

public class UnionTerritory {

	public String name;
	public String assembly;
	public int noOfTerritories;
	
	public void toRegulateTheAffairs(String name, int noOfTerritories) {
		
		this.name = name;
		this.noOfTerritories = noOfTerritories;
		
		System.out.println(this.name);
		System.out.println(this.noOfTerritories);
		
		
	}
}
