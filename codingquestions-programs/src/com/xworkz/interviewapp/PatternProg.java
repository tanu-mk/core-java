package com.xworkz.interviewapp;

public class PatternProg {
	
	public static void main(String[] args) {
				//0
		for(int row=1; row<=4; row++) {
			
			for(int col=1; col<=4; col++) {
				
				if(row==2 && col==4) {
					System.out.print("Xworkz");
				}
				else {
					System.out.print(col);
				}
			}
			
			System.out.println();
		}
		
	}

}
