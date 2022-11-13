package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.Base.Wood;

public class WoodTester {

	public static void main(String t[]) {
		
		Wood wd= new Wood();
		wd.toProvideSafety("Teak", 45371);
		

		Wood wd4 = new Wood();
		wd4.toProvideSafety("Rose", 85371);
		
		
	}
}
