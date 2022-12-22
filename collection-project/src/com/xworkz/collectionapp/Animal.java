package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animal {
	
	public static void main(String[] args) {
		
		String animal1 = "Horse";
		String animal2 = "Camel";
		String animal3 = "Giraffe";
		String animal4 = "Tiger";
		String animal5 = "Lion";
		String animal6 = "Dog";
		String animal7 = "Elephant";
		String animal8 = "Deer";
		String animal9 = "Panda";
		String animal10 = "Cow";
		
		Collection<String> animals = new ArrayList<String>();
		
		animals.add(animal10);
		animals.add(animal9);
		animals.add(animal8);
		animals.add(animal7);
		animals.add(animal6);
		animals.add(animal5);
		animals.add(animal4);
		animals.add(animal3);
		animals.add(animal2);
		animals.add(animal1);
		
		System.out.println("Accessing the elements");
		
		for(String str : animals) {
			System.out.println(str);
		}
		
		System.out.println("=============After using Iterator=============");
		
		Iterator<String> elements = animals.iterator();
		
		while(elements.hasNext()) {
			String str = elements.next();
			System.out.println(str);
		}
		
		
		
	}

}
