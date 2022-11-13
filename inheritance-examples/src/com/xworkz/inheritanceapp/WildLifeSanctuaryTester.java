package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.Base.WildLifeSanctuary;

public class WildLifeSanctuaryTester {
	
	public static void main(String t[]) {
		
		WildLifeSanctuary wild = new WildLifeSanctuary();
		wild.toProtectFloraAndFauna("Bhadra", "Flexible Boundary");
		
		WildLifeSanctuary wild5 = new WildLifeSanctuary();
		wild5.toProtectFloraAndFauna("Panna", "Flexible by the government");
		
		
	}
}
