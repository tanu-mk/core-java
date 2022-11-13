package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.Base.Comedian;

public class ComedianTester {
	
	public static void main(String t[]) {
		
		Comedian com = new Comedian();
		com.nameIs("Mr Bean");
		
		Comedian com6 = new Comedian();
		com6.nameIs("Charlie Champlin");
	}

}
