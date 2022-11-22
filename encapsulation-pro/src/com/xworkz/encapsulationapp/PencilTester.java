package com.xworkz.encapsulationapp;

import com.xworkz.encapsulationapp.classfiles.PencilDTO;

public class PencilTester {
	
	public static void main(String t[]) {
		
		PencilDTO pencil = new PencilDTO();
		pencil.setPencilId(4723);
		System.out.println(pencil.getPencilId());
		
		pencil.setPencilName("Apsara");
		System.out.println(pencil.getPencilName());
		
		
	}
	

}
