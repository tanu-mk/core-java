package com.xworkz.inheritanceapp.Base;

public class Festival {
	
	public String name;
	public String month;
	public String feature;
	
	public void toCelebrate(String name, String month) {
		
		this.name = name;
		this.month = month;
		
		System.out.println(this.name);
		System.out.println(this.month);
	}

}
