package com.xworkz.hospitalapp;

import java.util.Scanner;

public class WrapperTester {
	
	public static void main(String[] args) {
		
		int age = 89;
		//Boxing
		Integer age1 = age;
		// un-boxing
		int age2  = age1;
		
		long contactNo = 8908908908L;
		//Boxing
		Long contactNo1 = contactNo;
		//un-boxing
		long contactNo2 = contactNo1;
		
		char sc = 'A';
		//Boxing 
		Character sc1 = sc;
		//un-boxing
		char sc2 = sc1;
		
		double price = 345.78;
		Double price1 = price;
		double price2 = price1;	
		
		byte id = 99;
		Byte id1 = id;
		byte id2 = id1;
		
		short salary = 28000;
		Short salary1 = salary;
		short salary2 = salary1;
		
		float quantity = 120.98F;
		Float quantity1 = quantity;
		float quantity2 = quantity1;
		
		boolean isConnected = true;
		Boolean isConnected1 = isConnected;
		boolean isConnected2 = isConnected1;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = scanner.nextInt(); //primitive type
		Integer ag1 = age;//object is created using wrapper class
		
		
		
		
		
	}

}
