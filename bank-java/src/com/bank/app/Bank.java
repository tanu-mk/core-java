package com.bank.app;

public class Bank {

	static String bankNames[] = {null, null, null, null, null};
	static int r;
	
	public static boolean storeBankNames(String bankName) {
		
			bankNames[r] = bankName;
			r++;
			
			return false;
			
	}
			
			
			
	public static void getBankNames() {
		
		for(int r=0; r<bankNames.length; r++) {
			
			String ref = bankNames[r];
			
			System.out.println("The Bank name is " + ref);
		}
	}
			
			
			
	}

