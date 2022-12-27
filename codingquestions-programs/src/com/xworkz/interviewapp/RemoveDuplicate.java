package com.xworkz.interviewapp;

import java.util.Scanner;

public class RemoveDuplicate {
	
		public static void main(String[] args) {
			
			int arr[] = new int[50];
			int n;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter array size");
			n = sc.nextInt();

			System.out.println("Enter the" + " n " + "array element");
			
				for(int i=0; i<n; i++) {
					arr[i] = sc.nextInt();
				}
			
			
				for(int i=0; i<n; i++) {
					
					for(int j=i+1;j<n;) {
						
						if(arr[j] == arr[i]) {
							
							for(int k=j; k<n; k++) {
								arr[k] = arr[k+1];
							}
							n--;
						}
						else {
							j++;
						}
					}
				}
				
		System.out.println("Content of the array after duplicate removal");
		
			for(int i=0; i<n; i++) {
				
				System.out.println(arr[i] +"");
			}
				
		}

}
