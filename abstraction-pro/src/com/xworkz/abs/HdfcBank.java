package com.xworkz.abs;

public class HdfcBank implements ICard {
	
	@Override
	public void swipe() {
		System.out.println("Swipping HDFC Bank card");
	}

}
