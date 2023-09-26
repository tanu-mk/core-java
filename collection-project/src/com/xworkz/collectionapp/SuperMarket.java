package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class SuperMarket {
	
	public static void main(String[] args) {
		
		Collection<String> chocolates = new ArrayList<String>();
		chocolates.add("Dairy Milk");
		chocolates.add("Milky Bar");
		chocolates.add("KitKat");
		chocolates.add("Perk");
		Collection<String> cakes = new ArrayList<String>();
		cakes.add("Cup Cakes");
		cakes.add("Plum Cakes");
		cakes.add("Plain Cakes");
		cakes.add("Pastries");
		
		Collection<String> biscuits = new ArrayList<String>();
		biscuits.add("Hide and Seek");
		biscuits.add("Dark Fantasy");
		biscuits.add("Bourbon");
		biscuits.add("Good Day");
		
		System.out.println(chocolates.containsAll(biscuits));
		
		System.out.println("************************************");
		
		Iterator<String> data = cakes.iterator();
		while(data.hasNext()) {
			String value = data.next();
				if(value.contains("Cup Cakes")) {
					System.out.println("It is present");
				}
				else {
					System.out.println("Not Present");
				}
			}
		
		System.out.println("************************************");
		
		
		Iterator<String> data1 = chocolates.iterator();
		while(data1.hasNext()) {
			String value1 = data1.next();
				if(value1.contains("Dairy Milk")) {
					 data1.remove();
					 System.out.println(value1);
				}
		}
		
		
		
	}

}