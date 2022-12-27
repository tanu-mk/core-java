package com.xworkz.interviewapp;

public class Comparing {
	
	public static void main(String t[]) {
		
		String str = "madam";
		String reverse = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			reverse += str.charAt(i);
		}
		                                            
		if(str.equals(reverse)) {
			System.out.println("matched");
		}
		else {
			System.out.println("not matched");
		}
	}
}