package com.xworkz.abs;

public class ShopTester {
	
	public static void main(String[] args) {
		
		//Abstraction
		//ref - Interface & obj - class
		Shop shop = new BikeServiceShop();
		shop.doBusiness();
		
	}

}
