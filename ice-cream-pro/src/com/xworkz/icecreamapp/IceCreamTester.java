package com.xworkz.icecreamapp;


public class IceCreamTester {

	
	public static void main(String t[]){
		
		IceCream.quantity = "250 gms";

		IceCream sfd = new IceCream("Kulfi", "White", "Pista", 30);
		
		System.out.println("Features of IceCreams");
		System.out.println(sfd. name + " "+sfd.colour + " "+ sfd.flavour + " "+ sfd.price + " "+ IceCream.quantity);
		
		IceCream sfd1 = new IceCream("Gelato", "Chocolate", "Vanilla with Chocolate", 45);
		
		System.out.println("Features of IceCreams");
		System.out.println(sfd1. name + " "+sfd1.colour + " "+ sfd1.flavour + " "+ sfd1.price + " "+ IceCream.quantity);
		
		IceCream sfd2 = new IceCream("Snow Cream", "No colour", "Mixed Fruits", 80);
		
		System.out.println("Features of IceCreams");
		System.out.println(sfd2. name+ " "+sfd2.colour + " "+ sfd2.flavour + " "+ sfd2.price + " "+ IceCream.quantity);
		
}
}
