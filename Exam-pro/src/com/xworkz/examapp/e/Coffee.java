package com.xworkz.examapp.e;

public class Coffee {
	
	public String coffeePowder;
	public String coffeeNames[];
	private boolean isWaterPresent;
	private boolean isSugarAdded;
	
	public Coffee(String coffeePowder, String coffeeNames[], boolean isWaterPresent, boolean isSugarAdded  ) {
		
		this.coffeePowder = coffeePowder;
		this.coffeeNames = coffeeNames;
		this.isWaterPresent = isWaterPresent;
		this.isSugarAdded = isSugarAdded;
		
	}
	
	public void toProvideCoffee() {
		
	System.out.println("Coffee powder name is: "+ this.coffeePowder);
	System.out.println("Is water present in Coffee "+ isWaterPresent);
	System.out.println("Is sugar added in coffee "+ isSugarAdded);
	System.out.println("List of coffee names are: ");
		for(int i=0; i<coffeeNames.length; i++) {
			System.out.println(coffeeNames[i]);
			
		}
	}


}
