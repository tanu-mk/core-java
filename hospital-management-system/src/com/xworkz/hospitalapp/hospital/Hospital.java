package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public class Hospital {

	
	public Patient patient;
	public boolean isEmergency;
	public boolean isTreatmentRequired;
	
	public boolean admit(Patient patient) {
		boolean isAdmitted = false;
		
		if(isTreatmentRequired == true) {
		
			if(isEmergency == true) {
				this.patient = patient;
				this.patient.displayInfo();
				System.out.println("Patient can be allowed");
			}
			
			else {
			
				System.out.println("Patient is not allowed ");
			}
		}
			
			else {
				
				System.out.println("Maneg hoge enjoy madhe");
			
			}
		return isAdmitted;
		
		
	}
}
	

