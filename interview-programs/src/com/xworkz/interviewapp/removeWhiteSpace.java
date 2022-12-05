package com.xworkz.interviewapp;

public class removeWhiteSpace {
	
	public static void main(String[] args) {
		
		String str = "Consonant and Vowels";
		
		str = str.replaceAll("\\s+", "");
		
		System.out.println("String after removing white space : "+ str);
		
		
		
		
	}
	
	

}
