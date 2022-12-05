package com.xworkz.interviewapp;

public class EqualsExample {
	
	public static void main(String t[]) {
		
		String s1 = "Java";
		String s2 = "Java";
		String s3 = "JAVA";
		String s4 = "Python";
		
		int i1 = 4573;
		int i2 = 4573;
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s3));
		
		System.out.println(s2.equals(s4));
		
		
		
	}

}
