package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.Base.LongestRiver;

public class LongestRiverTester {
	
	public static void main(String t[]) {
		
		LongestRiver river = new LongestRiver();
		river.forInformation("Amazon River", "Colombia");
		
		LongestRiver river8 = new LongestRiver();
		river8.forInformation("Yellow River", "China" );
	}
}
