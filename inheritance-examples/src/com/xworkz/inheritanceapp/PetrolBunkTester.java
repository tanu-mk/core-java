package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.Base.PetrolBunk;

public class PetrolBunkTester {
	
	public static void main(String t[]) {
		
		PetrolBunk bunk = new PetrolBunk();
		bunk.toProvideFuel("Shell", 111);
		

		PetrolBunk bunk3 = new PetrolBunk();
		bunk3.toProvideFuel("Indian", 121);
		
		
	}

}
