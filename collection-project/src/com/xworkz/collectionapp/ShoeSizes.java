package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSizes {
	
	public static void main(String[] args) {
		
		int size1 = 3; 
		int size2 = 4; 
		int size3 = 5; 
		int size4 = 6; 
		int size5 = 7; 
		int size6 = 8; 
		int size7 = 9; 
		int size8 = 10; 
		int size9 = 11; 
		int size10 = 12; 
		int size11= 13; 
		int size12 = 14; 
		int size13 = 15; 
		int size14 = 16; 
		int size15 = 17;
		
		
		Collection<Integer> sizes = new ArrayList<Integer>();
		
		sizes.add(size15);
		sizes.add(size14);
		sizes.add(size13);
		sizes.add(size12);
		sizes.add(size11);
		sizes.add(size10);
		sizes.add(size9);
		sizes.add(size8);
		sizes.add(size7);
		sizes.add(size6);
		sizes.add(size5);
		sizes.add(size4);
		sizes.add(size3);
		sizes.add(size2);
		sizes.add(size1);
		
		for(Integer shoe : sizes ) {
			System.out.println(shoe);
		}
		
		System.out.println("===========After using Iterator==========");
		
		Iterator<Integer> unit =  sizes.iterator();
		
		while(unit.hasNext()) {
			Integer element = unit.next();
			System.out.println(element);
		}
		
		
		
	}

}
