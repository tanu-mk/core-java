package com.xworkz.interviewapp;

import java.util.Scanner;

public class CountOccurenceOfNumber {
	
	public static void main(String[] args) {
		
		int num[] = {1, 1, 2, 2, 3, 4, 5, 5, 6, 7};
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number you want to search");
		int n = sc.nextInt();
		
		for(int i=0; i<10; i++) {
			
			if(n == num[i]) {
				count++;
			}

			else {
				System.out.print(num[i] + " ");
			}
		}	
		
		System.out.print(count);
			
		
		}

}
