package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.hospital.Hospital;

public class HospitalTester {
	
	public static void main(String t[]) {
		
		Hospital hospital = new Hospital();
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
		hospital.savePatientNames("Ganesha");
		hospital.savePatientNames("Ganesh");
		hospital.savePatientNames("Gane");
		hospital.savePatientNames("Guna");
		hospital.savePatientNames("Gana");
		hospital.savePatientNames("Ganapa");
		
		hospital.getPatientNames();
		
		hospital.updatePatientNames("Guna" , "Guna Sarkar");
		
		hospital.getPatientNames();
		
		
		
		
		
		
		
	}

}
