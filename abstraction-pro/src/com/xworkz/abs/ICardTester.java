package com.xworkz.abs;

public class ICardTester {
	
	public static void main(String[] args) {
		
		ICard card = new SbiBank();
		card.swipe();
		
		ICard card1 = new HdfcBank();
		card1.swipe();
		
		ICard card2 = new IciciBank();
		card2.swipe();
		
		
		// polymorphism 
		Bank bank = new SbiBank();
		
		
		
	}

}
