package com.xworkz.icecreamapp;

import com.xworkz.icecreamapp.ice.IceCream;

public class IceCreamTester {
	
	public static void main(String d[]) {
		
		/*IceCream ice = new IceCream();
		ice.shopId = "JKGJD46485";
		ice.name = "Sri Krishna";
		ice.address = "Manjunath nagar";
		
		ice.menu = new String[3];
		ice.menu[0] = "Kulfi";
		ice.menu[1]= "ChocoBar";
		ice.menu[2]= "Candy";
		
		ice.flavours =new String[3];
		ice.flavours[0] = "Chocolate";
		ice.flavours[1] = "Vanilla";
		ice.flavours[2] = "Pista";
		
		ice.branches = new String[3];
		ice.branches[0] = "Malleshwaram";
		ice.branches[1] = "Jaynagar";
		ice.branches[2] = "Vijaynagar";*/
		
		

		String menu[] = new String[3];
		menu[0] = "Kulfi";
		menu[1]= "ChocoBar";
		menu[2]= "Candy";
		
		String flavours[] =new String[3];
		flavours[0] = "Chocolate";
		flavours[1] = "Vanilla";
		flavours[2] = "Pista";
		
		String branches[] = new String[3];
		branches[0] = "Malleshwaram";
		branches[1] = "Jaynagar";
		branches[2] = "Vijaynagar";
		
		IceCream ice = new IceCream("JKGJD46485", "Sri Krishna", "Manjunath nagar",  8908908908l,
										menu, flavours, branches  );
		
		
		
		
		
		
		
		ice.toFeelCool();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
