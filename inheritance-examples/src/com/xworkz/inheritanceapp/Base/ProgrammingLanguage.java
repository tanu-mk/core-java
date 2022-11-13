package com.xworkz.inheritanceapp.Base;

public class ProgrammingLanguage {
	
	public String name;
	public String instituteName;
	public String durationPeriod;
	
	public void forDeveloping(String name, String durationPeriod) {
	
		this.name = name;
		this.durationPeriod = durationPeriod;
		
		System.out.println(this.name);
		System.out.println(this.durationPeriod);
		
	}

}
