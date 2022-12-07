package com.xworkz.hospitalapp;
                                               //grouping the data into single block
import java.util.Scanner;

import com.xworkz.hospitalapp.apollo.ApolloHospital;
import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.patient.Patient;

public class ApolloHospitalTester {
	
	public static void main(String t[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		ApolloHospital apollo = new ApolloHospital(size);
		
		
		for(int i=0; i<size; i++) {
		
		Patient patient = new Patient();
		
		System.out.println("Enter Patient Name");
		 patient.setPatientName(sc.next());  //String age = sc.next();
		
		
		System.out.println("Enter Patient age");
		 patient.setAge(sc.nextInt());	//String address = sc.next();
			
		
		System.out.println("Enter Patient gender");
	 		String gender = sc.next();
	 	patient.setGender(Gender.valueOf(gender));
	 	
	 	System.out.println("Enter Patient address");
	 	 patient.setAddress(sc.next());
	 	 
	 	 
	 	 apollo.addPatients(patient);
	 	//patient.displayInfo();
	 	 
		}
		
		apollo.getAllPatients();
		
		System.out.println("Enter Patient Name");
		apollo.getPatientByName(sc.next());
		
		System.out.println("Enter Patient age");
		apollo.getPatientByAge(sc.nextInt());
		
		System.out.println("Enter Patient Address");
	 	apollo.getPatientByAddress(sc.next());
	 	
	 	System.out.println("Enter Patient Gender");
	 	apollo.getPatientByGender(Gender.valueOf(sc.next()));
	 	
	 	System.out.println("Enter Patient Gender");
	 	apollo.getPatientNameByGender(Gender.valueOf(sc.next()));
	 	
	 	System.out.println("Enter Patient Name");
	 	apollo.getGenderByPatientName(sc.next());
	
	}

}
