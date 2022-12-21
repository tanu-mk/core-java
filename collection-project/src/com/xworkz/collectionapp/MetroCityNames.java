package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class MetroCityNames {
	
	public static void main(String[] args) {
		
		String city1 = "Bangalore";
		String city2 = "Mumbai";
		String city3 = "Hyderabad";
		String city4 = "Chennai";
		String city5 = "Delhi";
		
		Collection<String> city = new ArrayList<String>();
		
		city.add(city5);
		city.add(city4);
		city.add(city3);
		city.add(city2);
		city.add(city1);
		
		for(String str : city) {
			System.out.println(str);
		}
		
		System.out.println("============After using Iterator============");
		
		 Iterator<String> element =  city.iterator();
		
		 while(element.hasNext()) {
			 String value = element.next();
			 System.out.println(value);
		 }
	}

}
