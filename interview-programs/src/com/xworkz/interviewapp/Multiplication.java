package com.xworkz.interviewapp;

import java.util.Scanner;

public class Multiplication {
	
	public static void main(String t[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int x,y,sum =0;
		
		System.out.println("Enter the first number: ");
		x = sc.nextInt();
		
		System.out.println("Enter the Second number: ");
		y = sc.nextInt();
		
		for(int i=1; i<=x; i++) {
			sum = sum + y;
		}
		System.out.println("The Multiplication of "+ x +" and  "+ y +" is: "+ sum);
	}
	
}
