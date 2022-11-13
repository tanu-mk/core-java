package com.xworkz.airportapp.airport;

import com.xworkz.airportapp.gender.Gender;

public class Passport {
	
	private String passportNo;
	private String countryCode;
	private String fullName;
	private Gender gender;
	
	public Passport(String passportNo, String countryCode, String fullName, Gender gender) {
		
		this.passportNo = passportNo;
		this.countryCode = countryCode;
		this.fullName = fullName;
		this.gender = gender;
	}
	
	
	public void displayInfo() {
		
		System.out.println("Candidate Passport No is: "+ this.passportNo);
		System.out.println("Candidate Country Code:" + this.countryCode);
		System.out.println("Candidate name is:"+ this.fullName);
		System.out.println("Candidate gender is:"+ this.gender);
		
	}

}
