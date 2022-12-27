package com.xworkz.interviewapp;

public class LargestAndSmallest {

	public static void toFindLargestAndSmallest(int a[]) {
		
		int smallest = a[0];
		int largest = a[0];
		
		for(int index=1; index < a.length; index++) {
			
			//System.out.println(a[index]);
			
			if(a[index] > largest) {
				largest = a[index];
			}
			else if(a[index] < smallest) {
				smallest = a[index];
			}
		}
		
		System.out.println("The Largest Number is "+ largest);
		System.out.println("The Smallest Number is "+ smallest);
		
	}
	public static void main(String t[]) {
		
		int a[] = {75, 35, 92, 4, 44, 67, 635, 325};
		toFindLargestAndSmallest(a);
	}
		
	}
	

