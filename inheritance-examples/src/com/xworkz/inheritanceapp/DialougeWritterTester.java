package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.Base.DialougeWritter;

public class DialougeWritterTester {
	
	public static void main(String t[]) {
		
		DialougeWritter wrt = new DialougeWritter();
		wrt.toWrite("Chethu", "Kathegallu");
		
		DialougeWritter wrt3 = new DialougeWritter();
		wrt3.toWrite("Manu", "Poem");
		
		
	}

}
