package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.constant.Gender;

public class Patient {
	
	private String patientName;
	private String address;
	private Gender gender;
	private Integer age;  //Wrapper class
	
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientName() {
		return patientName;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Gender getGender() {
		return gender;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getAge() {
		return age;
	}
	
	
	/*public Patient(String patientName, String address, Gender gender, Integer age) {
		
		this.patientName = patientName;
		this.address = address;
		this.gender = gender;
		this.age = age;
	}*/
	
	public void displayInfo() {
		
		System.out.println("Patient name is: "+ this.patientName);
		System.out.println("Patient address is: " + this.address);
		System.out.println("Patient gender is :" + this.gender);
		//System.out.println("Patient age is: "+ this.age);
		
		
		}

}
