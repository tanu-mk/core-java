package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class HospitalTester {
	
	public static void main(String t[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Patient Name");
			String patientName = sc.next();
		System.out.println("Enter Patient address");
			String address = sc.next();
		System.out.println("Enter Patient's age");
			int age = sc.nextInt();
		
		Patient patient = new Patient(patientName, address, Gender.female, age);
		
		
		Hospital hospital = new Hospital();
		hospital.isEmergency = true;
		hospital.isTreatmentRequired = true;
		
		boolean isAdmitted = hospital.admit(patient);
		
		
		System.out.println("Allow the patient to admit in Hospital: "+ isAdmitted);
	
	
		sc.close();  //return type void
	}

}
