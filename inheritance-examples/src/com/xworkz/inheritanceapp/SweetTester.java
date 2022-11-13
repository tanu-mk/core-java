package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.Base.Sweet;

public class SweetTester {
	
	public static void main(String t[]) {
		
		Sweet swt = new Sweet();
		swt.toTaste("Gulab Jamun", 120);
		
		Sweet swt4 = new Sweet();
		swt4.toTaste("Rasgulla", 180);
	}

}
