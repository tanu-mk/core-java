package com.xworkz.hosptalapp.ApolloHospital;

import com.xworkz.hosptalapp.hospital.Hospital;
import com.xworkz.hosptalapp.patient.Patient;

public class ApolloHospitalImpl implements Hospital {

	public Patient patients[];
	public int index;
	public Patient newPatients[];
	

	@Override
	public boolean addPatients(Patient anotherPatient) {
		
		boolean isPatientAdded = false;
		
		if(anotherPatient!=null) {
			System.out.println("The patient is added");
				patients[index++] = anotherPatient; 
				//index++
				isPatientAdded = true;
			
		}
		
	return isPatientAdded;
	
	}

	
	@Override
	public void getAllPatients() {
		
		for (int i = 0; i < patients.length; i++) {
			
			System.out.println(patients[i].getPatientName() + " "+ patients[i].getAddress() + " "+ patients[i].getGender()+ " "+ patients[i].getAge());
			
		} 
			
	}
	
	
	@Override
	public void getPatientByName(String name) {
		System.out.println("inside getPatientByName");
		System.out.println("No of parameter: 1  : type(String)");
		
		for(int i=0; i < patients.length; i++) {
			
			if(patients[i].getPatientName().equals(name)) 
				System.out.println(patients[i].getPatientName() + " "+ patients[i].getAddress() + " "+ patients[i].getGender()+ " "+ patients[i].getAge());

			else {
				System.out.println("Patient not found");
			}
		}
		
	}
	


	
	
}
