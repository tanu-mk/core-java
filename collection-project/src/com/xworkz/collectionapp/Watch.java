package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watch {
	
	public static void main(String[] args) {
		
		String watch1 = "Fastrack";
		String watch2 = "Omega";
		String watch3 = "Titan";
		String watch4 = "HMT";
		String watch5 = "Boat";
		
		Collection<String> watches = new ArrayList<String>();
		
		watches.add(watch5);
		watches.add(watch4);
		watches.add(watch3);
		watches.add(watch2);
		watches.add(watch1);
		
		for(String str:watches) {
			
			System.out.println(str);
		}
	
		System.out.println("==============After calling iterator===========");
		
		Iterator<String> element = watches.iterator();
		
		while(element.hasNext()) {
			String ref = element.next();
			System.out.println(ref);
		}
	
	
	}
	
	

}
