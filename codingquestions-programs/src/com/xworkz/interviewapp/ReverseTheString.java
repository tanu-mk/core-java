package com.xworkz.interviewapp;

public class ReverseTheString {
	
	public static String reverseString(String str) {
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}
	
	public static void main(String t[]) {
		
		System.out.println(ReverseTheString.reverseString("My Name is Tanuja"));
		
	}

}
