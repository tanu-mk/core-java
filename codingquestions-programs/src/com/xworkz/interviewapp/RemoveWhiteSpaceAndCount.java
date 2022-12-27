package com.xworkz.interviewapp;

import java.util.Scanner;

public class RemoveWhiteSpaceAndCount {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		      String str = sc.nextLine();
		
		int count = 0;
		
		char g[] =str.toCharArray();
		
		for(int i=0; i<g.length; i++) {
			
			if(g[i] == ' ') {
				
				count += 1;
				//continue;
			}
			else {
				System.out.print(g[i]);
			}
			
		}
		
		System.out.println();
		System.out.println("Number of space:" + count);
	
	}

}
