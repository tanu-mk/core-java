package com.xworkz.hospitalapp.hospital;

public class Hospital {
	
	String patientNames[] = new String[6];
	int index;
	
	public Hospital() {
		
		System.out.println("Hospital object is created");
	}
	
	
	public boolean savePatientNames(String patientName) {
		
		System.out.println("Inside savePatientNames");
			if(patientName != null && patientNames.length > index) {
				patientNames[index++] = patientName;
				return true;
			}
			else {
				System.out.println("Fill hagede bed kali ella");
			}
		System.out.println("End of savePatientNames");
		return false;
	}
	

	public void getPatientNames() {
		
		for(int i=0; i<patientNames.length; i++) {
			System.out.println(patientNames[i]);
		}
	}
	
	
	public boolean updatePatientNames(String oldPatientName , String newPatientName) {
		
		System.out.println("inside updatepatientNames");
		for(int i=0; i<patientNames.length; i++) {
			if(patientNames[i] == oldPatientName) {
				patientNames[i] = newPatientName;
			return true;
			}
			
			else 
			{
		      //negative message
			}
		}
			System.out.println("end of updatepatientNames");
			return false;
	}
	
}
