package com.xworkz.encapsulationapp;

import com.xworkz.encapsulationapp.classfiles.FlowerDTO;

public class FlowerTester {
	
	public static void main(String t[]) {
		
		FlowerDTO flower = new FlowerDTO();
		flower.setFlowerName("Orchids");
		System.out.println(flower.getFlowerName());
		
		flower.setFlowerColor("Lightish Purple");
		System.out.println(flower.getFlowerColor());		
		
	}

}
