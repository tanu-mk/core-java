package com.xworkz.interviewapp;

public class StringProgram {
	
	public static void main(String[] args) {
		
		String name = "Java Programming";
		//System.out.println(name);
		
		
		//in-built
		for(int i=0; i<name.length(); i++) {
			System.out.print(name.charAt(i));
		}
		
		System.out.println("The reverse order of the String is");
		
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		
		
		//counting a char
		
		int count = 0;
		int count1 = 0;
		
		for(int i=0; i<name.length();i++) {
			if(name.charAt(i)=='a') {
				count++; //count += 1;
			}
			else {
				count1++; //count1 += 1;
			
		}
			
		}
			System.out.println(count);
			System.out.println(count1);
	
			
			
			
			String str = "Good Learning";
			int count2 = 0;
			for(char ch:str.toCharArray()) {
				if(ch=='o') {
					count2 += 1;
				}
			}
			System.out.println(count2);
		
	}
}