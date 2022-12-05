package com.xworkz.interviewapp;

import java.util.Scanner;

public class PrimeNumbersTillN {
	
	public static void main(String t[]) {
		
		int n;
		int cn;
		int count;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number");
			n = sc.nextInt();
			
		System.out.println(" /n  List of prime numbers between 1 to " + n + " ");
		
		for(int i=1; i<=n; i++) {
			
			cn = i;
			count = 0;
			
		for(int j=1; j<=n; j++) {
			{
				if(cn%j == 0) {
					count++;
				}
					
			}
				if(count == 2) {
					
			System.out.println("" + cn);
				}
			
		}
		}
			
		
		
	}
		
		
	}


