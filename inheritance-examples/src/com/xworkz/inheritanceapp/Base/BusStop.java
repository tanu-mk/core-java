package com.xworkz.inheritanceapp.Base;

public class BusStop {
	
	public String name;
	public String place;
	public String kilometers;
	
	public void forOnbardingBus(String name, String place) {
		
		this.name = name;
		this.place = place;
		
		System.out.println(this.name);
		System.out.println(this.place);
		
	}

}
