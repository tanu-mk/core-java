package com.xworkz.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Location {
	
	@Autowired
	private Area area;

	public Location() {
		System.out.println("created location created");
	}

	public void toVerifyTheArea() {
		System.out.println(this.area.hashCode() +"hashcode of ref area");
	}


}
