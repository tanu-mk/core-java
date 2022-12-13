package com.xworkz.abs;

//implementation class
public class SbiBank extends Bank implements ICard{
	
	
	@Override
	public void swipe() {
		System.out.println("Swipping SBI Bank card");
	}

}
