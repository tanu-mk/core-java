package com.xworkz.softdrinksapp;

public class SoftDrinksTester {
	
	public static void main(String t[]){
	
	SoftDrinks.quantity = "250 ml";

	SoftDrinks sfd = new SoftDrinks("SKT1716", "Coco Cola", "Artificial", 35);
	
	System.out.println("Features of SoftDrinks");
	System.out.println(sfd.softDrinksId + " "+sfd.name + " "+ sfd.flavouring + " "+ sfd.price + " "+ SoftDrinks.quantity);
	
    SoftDrinks sfd1 = new SoftDrinks("SST1516", "Sprit", "Artificial", 42);
	
	System.out.println("Features of SoftDrinks");
	System.out.println(sfd1.softDrinksId + " "+sfd1.name + " "+ sfd1.flavouring + " "+ sfd1.price + " "+ SoftDrinks.quantity);
	
	SoftDrinks sfd2 = new SoftDrinks("JSG716", "Coffee", "Natural", 124);
	
	System.out.println("Features of SoftDrinks");
	System.out.println(sfd2.softDrinksId + " "+sfd2.name + " "+ sfd2.flavouring + " "+ sfd2.price + " "+ SoftDrinks.quantity);
	
	
	
	
	}
	
	
	
	
}
