package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.constant.Gender;

public class Patient {
	
	public String patientName;
	public String address;
	public Gender gender;
	public int age;
	
	public Patient(String patientName, String address, Gender gender, int age) {
		
		this.patientName = patientName;
		this.address = address;
		this.gender = gender;
		this.age = age;
	}
	
	public void displayInfo() {
		
		System.out.println("Patient name is: "+ this.patientName);
		System.out.println("Patient address is: " + this.address);
		System.out.println("Patient gender is :" + this.gender);
		System.out.println("Patient age is: "+ this.age);
		
		
		}

}
