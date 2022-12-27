package com.xworkz.interviewapp;

public class ThirdLargest {
	
	public static void main(String[] args) {
		
		int array[] = {64, 78, 89, 47, 342, 789, 32, 65};
		int temp;
		
		for(int i=0; i<array.length; i++) {
			
			for(int j=i+1; j<array.length; j++) {
				
				if(array[i]>array[j]) {
					
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					
				}
				
			}
		}
		
		System.out.println("Third largest number is"  + " " +  array[array.length-3]);
		
	}

}
