package com.xworkz.encapsulationapp;

import com.xworkz.encapsulationapp.classfiles.HospitalDTO;

public class HospitalTester {
	
	public static void main(String t[]) {
		
	HospitalDTO hospital = new HospitalDTO();
	hospital.setHospitalId(637);
	System.out.println(hospital.getHospitalId());
	
	hospital.setHospitalName("People Tree");
	System.out.println(hospital.getHospitalName());
	
	
	}
	}