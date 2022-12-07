package com.xworkz.hospitalapp.apollo;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class ApolloHospital extends Hospital {
	
	public Patient patients[];
	public int index;
	
	public ApolloHospital(int size) {
		
		patients = new Patient[size];
	}
	
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
	
	
	public void getAllPatients() {
		
		for (int i = 0; i < patients.length; i++) {
			
			System.out.println(patients[i].getPatientName() + " "+ patients[i].getAddress() + " "+ patients[i].getGender()+ " "+ patients[i].getAge());
			
		} 
			
	}
	
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
	
	
	public void getPatientByAge(int newAge) {
		System.out.println("Inside getPatientByName");
		System.out.println("No of parameters : 1");
		
		for(int j=0; j<patients.length; j++) {
			
				if(patients[j].getAge().equals(newAge))
					System.out.println(patients[j].getPatientName() + " "+ patients[j].getAddress() + " "+ patients[j].getAge() + " "+ patients[j].getGender());
				else {
					System.out.println("Antha Patient yaru ella");
				}
		}
	}
	
	
	public void getPatientByAddress(String newAddress) {
		System.out.println("Inside getPatientByAddress");
		
		for(int t=0; t<patients.length; t++) {
			
			if(patients[t].getAddress().equals(newAddress))
			
				System.out.println(patients[t].getAddress());
		 	}
		} 
	


	public void getPatientByGender(Gender newGender) {
		System.out.println("Inside getPatientByGender");
		
		for(int g=0; g<patients.length; g++) {
			
			if(patients[g].getGender().equals(newGender))
			
				System.out.println(patients[g].getGender());
		
			}
		}
		
		
	public void getPatientNameByGender(Gender newGender1) {
		System.out.println("Inside getPatientNameByGender");
		
		for(int k=0; k<patients.length; k++) {
			
			if(patients[k].getGender().equals(newGender1))
			
				System.out.println(patients[k].getPatientName());
		
			}
		
	}
		
	public void getGenderByPatientName(String anotherName) {
		System.out.println("Inside getGenderByPatientName");
		
			for(int h=0; h<patients.length; h++) {
				
				if(patients[h].getPatientName().equals(anotherName))
				
					System.out.println(patients[h].getGender());
			}
	}
		
	}
