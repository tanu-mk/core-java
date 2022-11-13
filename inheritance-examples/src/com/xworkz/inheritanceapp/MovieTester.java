package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.Base.Movie;

public class MovieTester {

	public static void main(String t[]) {
		
		Movie mov = new Movie();
		mov.toHaveFun("Love Mocktail", 150);
		
		Movie mov8 = new Movie();
		mov8.toHaveFun("KGF", 180);

	}
}
