package com.xworkz.showroomapp.manager;

import com.xworkz.showroomapp.constant.Gender;

public class Manager {
	
	private String name;
	private int id;
	private Gender gender;
	private String address;
	private String bloodGroup;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Gender getGender() {
		return gender;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	

	
	
	public void displayInfo() {
		
		System.out.println("Enter manager name:" + this.name);
		System.out.println("Enter manager id:" + this.id);
		System.out.println("Enter manager gender:" + this.gender);
		System.out.println("Enter manager address:" + this.address);
		System.out.println("Enter manager bloodGroup:" + this.bloodGroup);
		
		
	}
	

}
