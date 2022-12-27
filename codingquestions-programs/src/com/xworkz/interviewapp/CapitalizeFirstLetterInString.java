package com.xworkz.interviewapp;

import java.util.Scanner;

public class CapitalizeFirstLetterInString {
	
		public static void main(String[] args) {
			
//			String str = "baaro magane ache nodkothini";
//			
//			String firstLetter = str.substring(0, 1);
//			String remainingLetters = str.substring(1, str.length());
//			
//			firstLetter = firstLetter.toUpperCase();
//			
//			str = firstLetter + remainingLetters;
//			
//			System.out.println(str);
//			
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Sentence");
			
			String str = sc.nextLine();
			str = " " + str;
			
			String sentence = "";
			
			for(int i=0; i<str.length(); i++) {
				
				char ch = str.charAt(i);
				
				if(ch == ' ') {
					
					sentence = sentence + ch;
					i++;
					ch = str.charAt(i);
					sentence = sentence + Character.toUpperCase(ch);
					
				}
				else {
					sentence = sentence + ch;
				}
				
			}
			
			sentence = sentence.trim();
			System.out.println(sentence);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

}
