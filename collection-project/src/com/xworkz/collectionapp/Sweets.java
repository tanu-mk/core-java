package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;

public class Sweets {
	
	public static void main(String[] args) {
		
		String sw1 = "Kaju barfi";
		String sw2 = "Champakali";
		String sw3 = "Rasgula";
		String sw4 = "Jamoon";
		String sw5 = "Ladoo";
		String sw6 = "Sompa";
		String sw7 = "Jahangir";
		String sw8 = "Mysore Pak";
		String sw9 = "Olege";
		String sw10 = "Payasa";
		String sw11 = "Badam poori";
		String sw12 = "Rasmali";
		String sw13 = "Jeelabi";
		
		Collection<String> collection = new ArrayList(); 
		
		collection.add(sw13);
		collection.add(sw12);
		collection.add(sw11);
		collection.add(sw4);
		collection.add(sw5);
		collection.add(sw7);
		collection.add(sw13);
		
		System.out.println(collection.size());
		
		collection.clear();
		
		System.out.println("After clearing.......");
		System.out.println(collection.size());
		
		
		
		
		
		
		
	}

}
