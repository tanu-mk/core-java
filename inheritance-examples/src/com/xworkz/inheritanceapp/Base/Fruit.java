package com.xworkz.inheritanceapp.Base;

public class Fruit {
	
	public String name;
	public String type;
	public String importedFrom;
	public double price;
	
	public void toProvideEnergy(String name, String type) {
		
		this.name = name;
		this.type = type;
		
		System.out.println(this.name);
		System.out.println(this.type);
		
	}
	
	public void toProvideSufficientNutients(String ediblePart, String botanicalName ) {
		
	System.out.println("Edible part of "+ ediblePart);
	System.out.println("Botanical name of  the fruit is " + botanicalName);
	
	
		
	}
	

}
