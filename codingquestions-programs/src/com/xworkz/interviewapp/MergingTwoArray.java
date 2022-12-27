package com.xworkz.interviewapp;

public class MergingTwoArray {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4};
		int b[] = {5,6,7,8,9,10};
		int c[] = new int[a.length + b.length];
		//int count = 0;
		
		for(int i=0; i<a.length; i++) {
			c[i] = a[i];
			//count++;
		}
		
		for(int j=0; j<b.length; j++) {
			c[a.length+j]= b[j];
		}
		
		for(int k=0; k<c.length; k++) {
			System.out.print(c[k] + " ");
		}
		
	}

}
