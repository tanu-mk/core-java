package com.xworkz.encapsulationapp;

import com.xworkz.encapsulationapp.classfiles.AquariumDTO;

public class AquariumTester {
	
	public static void main(String t[]) {
		
		AquariumDTO aqua = new AquariumDTO();
		aqua.setPlaceName("UnderWater Aqua World");
		System.out.println(aqua.getPlaceName());
		
		aqua.setNoOfFishTypes(87);
		System.out.println(aqua.getNoOfFishTypes());
	}

}
