package com.xworkz.interviewapp;

public class SwapFirstAndLastName {

	public static void main(String[] args) {
		
		String name = "John McClane";
		
		System.out.println("Before:\n " + name);
		
		String firstName = name.substring(0, name.indexOf(" "));
		
		String lastName = name.substring(name.indexOf(" "));
		
		String swapName = lastName + " "+ firstName;
		
		System.out.println("After :\n " + swapName);
		
		
		
		
		
	}
	
}
