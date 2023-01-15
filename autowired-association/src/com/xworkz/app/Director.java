package com.xworkz.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {
	
	@Autowired
	private Experience experience;
	
	public Director() {
		System.out.println("Creating object for director");
	}
	
	public void toCheckExperience() {
		System.out.println(this.experience.hashCode());
	}
	
	
}
