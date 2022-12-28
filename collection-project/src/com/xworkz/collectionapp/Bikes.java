package com.xworkz.collectionapp;

import java.util.Collection;
import java.util.LinkedList;

public class Bikes {
	
	public static void main(String[] args) {
		
		String bk1 ="KTM";
		String bk2 ="Royal Enfield";
		String bk3 ="Pulsar";
		String bk4 ="Duke";
		String bk5 ="Honda";
		String bk6 ="Yamaha";
		String bk7 ="BMW S 1000 RR";
		String bk8 ="Ducati";
		String bk9 ="BGAUSS";
		String bk10 ="Suzuki";
		String bk11 ="JAWA";
		String bk12 ="Vespa";
		String bk13 ="Kawasaki";
		String bk14 ="Revolt";
		String bk15 ="Tork";
		String bk16 ="Zelio";
		String bk17 ="Wroley";
		String bk18 ="Tunwal";
		
		Collection<String> collection = new LinkedList();
		
		collection.add(bk1);
		collection.add(bk18);
		collection.add(bk3);
		collection.add(bk16);
		
		System.out.println(collection.size());
		
		collection.clear();
		
		System.out.println("After clearing.......");
		System.out.println(collection.size());
		
	}

}
