package com.xworkz.collectionapp;

import java.util.Collection;
import java.util.TreeSet;

public class Currency {
	
	public static void main(String[] args) {
		
		String cr1 = "Naira";
		String cr2 = "Balboa";
		String cr3 = "Guarani";
		String cr4 = "Rand";
		String cr5 = "Baht";
		String cr6 = "Bolivar";
		String cr7 = "Zloty";
		String cr8 = "Kyat";
		String cr9 = "Tugrik";
		String cr10 = "Dirham";
		String cr11 = "Rufiyaa";
		String cr12 = "Ariary";
		String cr13 = "Tenge";
		String cr14 = "Yen";
		String cr15 = "Rupiah";
		String cr16 = "Rupees";
		String cr17 = "Dollars";
		String cr18 = "Cedi";
		String cr19 = "Kuna";
		String cr20 = "Colon";
		String cr21 = "Riel";
		String cr22 = "Lev";
		String cr23 = "Real";
		String cr24 = "Taka";
		String cr25 = "Algeria";
		String cr26 = "Eura";
		
		
		Collection<String> collection = new TreeSet();
		
		collection.add(cr22);
		collection.add(cr13);
		collection.add(cr6);
		collection.add(cr5);
		collection.add(cr26);
		collection.add(cr25);
		collection.add(cr22);
		collection.add(cr20);
		collection.add(cr18);
		
		System.out.println(collection.size());
		
		collection.clear();
		
		System.out.println("After clearing");
		System.out.println(collection.size());
		
		
		
		
	}

}
