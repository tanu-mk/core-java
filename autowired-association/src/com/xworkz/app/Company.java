package com.xworkz.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	
	@Autowired
	private Location location;

	public Company() {
		System.out.println("created company object");
	}

	public void toCheckLocation() {
		System.out.println(this.location.hashCode() +"hashcode of ref location");
	}


}
