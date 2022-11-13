package com.xworkz.inheritanceapp.Base;

public class SearchEngine {
	
	public String name;
	public String advantage;
	public String type;
	
	public void toSearchInformation(String name, String advantage) {
		
		this.name = name;
		this.advantage = advantage;
		
		System.out.println(this.name);
		System.out.println(this.advantage);
	}

}
