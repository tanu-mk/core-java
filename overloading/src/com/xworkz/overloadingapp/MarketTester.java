package com.xworkz.overloadingapp;

import com.xworkz.overloadingapp.conceptoverloading.Market;

public class MarketTester {
	
	public static void main(String t[]) {
		
		/*String vegetables[] = {"Tomato", "Potato", "Onion", "Brinjal", "Carrot", "Beans", "Ladys Finger", "Raddish"}; 
		
		Market kt = new Market(2536, "K R Market", "Shivajinagar", vegetables);*/
		

		String vegetables[] = {"Tomato", "Potato", "Onion", "Brinjal", "Carrot", "Beans", "Ladys Finger", "Raddish"}; 
		Market kt2 = new Market( vegetables);
		
		
		System.out.println(kt2.id + " "+ kt2.name + " "+ kt2.place);
		
		
		kt2.toPurchaseVegetables();
		
		
	}

}
