package com.xworkz.encapsulationapp;

import com.xworkz.encapsulationapp.classfiles.HospitalDto;

public class HospitalTester {
	
	public static void main(String t[]) {
		
	HospitalDto hospital = new HospitalDto();
	
	hospital.setName("Manipal Hospital");
	hospital.setId(8439);
	hospital.setAddress("Domlur");
	hospital.setNoOfBranches(4);
	hospital.setNoOfDoctorsPresent(287);
	
	}
}