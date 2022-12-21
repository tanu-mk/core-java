package com.xworkz.collectionapp;

import java.util.Collection;
import java.util.TreeSet;

public class Coupons {
	
	public static void main(String[] args) {
		
		String cp1 = "Gift Guide";
		String cp2 = "Shopping Spree";
		String cp3 = "Door Buster";
		String cp4 = "Spooky 15";
		String cp5 = "No Tricks";
		String cp6 = "Big Treat";
		String cp7 = "Festive 10";
		String cp8 = "Holiday Spirit";
		String cp9 = "Red Hat White Beard";
		String cp10 = "Jolly 15";
		String cp11 = "School Pack";
		String cp12 = "Little Learners";
		
		
		Collection<String> collection = new TreeSet();
		
		collection.add(cp12);
		collection.add(cp1);
		collection.add(cp2);
		collection.add(cp7);
		collection.add(cp9);
		
		System.out.println(collection.size());
		
		collection.clear();
		
		System.out.println("After clear method");
		System.out.println(collection.size());
		
		
		
		
	}

}
