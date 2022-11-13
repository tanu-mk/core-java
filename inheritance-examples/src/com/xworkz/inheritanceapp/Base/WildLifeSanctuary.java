package com.xworkz.inheritanceapp.Base;

public class WildLifeSanctuary {
	
	public String name;
	public String protectedArea;
	public String boundaryLine;
	
	public void toProtectFloraAndFauna(String name, String boundaryLine) {
		
		this.name = name;
		this.boundaryLine = boundaryLine;
		
		System.out.println(this.name);
		System.out.println(this.boundaryLine);
	}

}
