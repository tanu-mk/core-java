package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.Base.NonVeg;

public class NonVegTester {
	
	public static void main(String t[]) {
		
		NonVeg non = new NonVeg();
		non.toEat("Fish", 350);
		
		NonVeg non3 = new NonVeg();
		non3.toEat("Meat", 750);
		
		
	}

}
