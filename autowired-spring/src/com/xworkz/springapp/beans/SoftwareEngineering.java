package com.xworkz.springapp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineering {
	
	@Autowired
	@Qualifier("engineerName")
	private String engineerName;
	@Autowired
	@Qualifier("salary")
	private double salary;
	@Autowired
	@Qualifier("companyName")
	private String companyName;
	@Autowired
	@Qualifier("experience")
	private double experience;
	
	@Override
	public String toString() {
		return "SoftwareEngineering [name=" + engineerName + ", salary=" + salary + ", companyName=" + companyName
				+ ", experience=" + experience + "]";
	}
	

}
