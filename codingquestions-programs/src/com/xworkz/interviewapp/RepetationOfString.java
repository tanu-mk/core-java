package com.xworkz.interviewapp;

import java.util.Scanner;

public class RepetationOfString {
	
	public static void main(String[] args) {
		
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		System.out.println("Enter a word to find its Occurence");
		String word = sc.next();
		
		String words[] = str.split(" ");
		
		for(int i=0; i<words.length; i++) {
			
			if(word.equals(words[i])) {
				count++;
		
			}
			
			
		}
		System.out.println(count);
		
		
		
		
		
		
		
	}

}
