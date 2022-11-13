package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.Base.Flower;

public class FlowerTester {
	
	public static void main(String t[]) {
		
		Flower flr = new Flower();
		flr.toDecorate("Orchids", "Purple, Pink, Yellow");
		
		Flower flr3 = new Flower();
		flr3.toDecorate("Tulip", "Purple, Pink, Yellow");
		
	}

}
