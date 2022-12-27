package com.xworkz.interviewapp;

public class InterviewTester {
	
	public static void reverse(String data) { 
		
		char str[] = data.toCharArray() ;
		
		/*for(int index = 0; index < newData.length; index++) {
			System.out.println(newData[index]);
		}*/
		
		for(int index =str.length-1; index >= 0; index--) {
			System.out.print(str[index]);         //for space (+ " ")
		}
	}
		
	public static void main(String t[]) {
		
		reverse("Tanuja");
		
	}
	}
	
	


