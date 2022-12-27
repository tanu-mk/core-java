package com.xworkz.interviewapp;

import java.util.Scanner;

public class Coupon {
	
	public static void main(String t[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		checkPattern(str);
		sc.close();
		
	}
	
	
	
	public static void checkPattern(String str) {
		
		boolean status = false;
		
		if(str.length() == 9) {
			
			if(Character.isUpperCase(str.charAt(0)) && Character.isUpperCase(str.charAt(1)) && Character.isUpperCase(str.charAt(str.length()-1)) ) {
				
				if(Character.isDigit(str.charAt(2)) && Character.isDigit(str.charAt(3)) && Character.isDigit(str.charAt(4)) && Character.isDigit(str.charAt(5))){ 
					status = true;
				}
				
			}
		}
		
	if(status = true) {
		System.out.println("Coupon is Valid");
	}
	else {
		System.out.println("Coupon is Invalid");
	}
		
	}

	}

	
	
	

