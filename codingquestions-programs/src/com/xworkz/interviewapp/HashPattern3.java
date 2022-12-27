package com.xworkz.interviewapp;

public class HashPattern3 {
	
	public static void main(String[] args) {
		
		for(int row=1; row<=4; row++) {
			
			for(int col=1; col<=4; col++) {
				
				if(row==1 || col==1 || row==2&&col==2) {
				System.out.print("#");
				}
			}
			
			System.out.println();
		}
	}

}
