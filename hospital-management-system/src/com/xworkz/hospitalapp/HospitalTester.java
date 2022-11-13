package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class HospitalTester {
	
	public static void main(String t[]) {
		
		Patient patient = new Patient("Chaya", "Marathahalli", Gender.female, 25);
		
		
		Hospital hospital = new Hospital();
		hospital.isEmergency = true;
		hospital.isTreatmentRequired = true;
		
		boolean isAdmitted = hospital.admit(patient);
		
		
		System.out.println("Allow the patient to admit in Hospital: "+ isAdmitted);
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
