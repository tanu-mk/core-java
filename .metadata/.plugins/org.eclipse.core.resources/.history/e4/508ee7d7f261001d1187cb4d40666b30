package com.xworkz.examapp;

import com.xworkz.examapp.e.Coffee;
import com.xworkz.examapp.e.CoffeeShop;

public class CoffeeShopTester {
	
	public static void main(String t[]) {
		
		String coffeeNames[] = {"Cold Brew Coffee", "Butter Beans", "Cafe Royal", "Cafe Robusta"};
		Coffee cfe = new Coffee("Nestle", coffeeNames,  false, true);
		
		
		CoffeeShop shop = new CoffeeShop();
		shop.price = 80;
		

		boolean isConnected =  shop.filter(cfe)	;
		
		System.out.println("Coffee is connected "+ isConnected);
		
		
		
		
		
	}

}
