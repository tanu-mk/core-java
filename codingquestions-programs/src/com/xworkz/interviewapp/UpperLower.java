package com.xworkz.interviewapp;

import java.util.Scanner;

public class UpperLower {
	
	public static void main(String[] args) {
		
		String st;
		int i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String Which is to be converted to LowerCase");
		st = sc.nextLine();
		
		char str[] = st.toCharArray();
		
		for(i=0; i<str.length; i++) {
			
				if(str[i] >= 'A'  &&  str[i] <= 'Z') {
					
					str[i] = (char)((int)str[i]+32);
				}
			
			
		}
		
		System.out.println("The string in lower case is");
			for(i=0; i<str.length; i++) {
					System.out.println(str[i]);
				
			}
	}

}
