package com.xworkz.encapsulationapp;

import com.xworkz.encapsulationapp.classfiles.ChocolateDTO;

public class ChocolateTester {
	
	public static void main(String t[]) {
		
		ChocolateDTO choco = new ChocolateDTO();
		choco.setChocolateId(84765);
		System.out.println(choco.getChocolateId());
		
		choco.setChocolateName("Ferori");
		System.out.println(choco.getChocolateName());
		
		
		
		
	}

}
