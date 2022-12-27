package com.xworkz.interviewapp;

public class CountVowelConsonant {
	
	public static void main(String t[]) {
		
		int vCount = 0 , cCount =0;
		String str = "Rest a while and run a mile";
		
		//str = str.toLowerCase();
		
		for(int g=0; g<str.length(); g++) {
			
			if(str.charAt(g) == 'a' || str.charAt(g) =='e' || str.charAt(g) =='i' || str.charAt(g) =='o' || str.charAt(g) =='u') {
				vCount++;
			}
			
			else if(str.charAt(g) >= 'a' || str.charAt(g) <='z') {
				cCount++;
				
			}
		}
		System.out.println("Number of vowels: " + vCount);
		System.out.println("Number of Consonants " + cCount);
		
		}
}
