package com.xworkz.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery {
	
	@Autowired
	private Capacity capacity;

	public Battery() {
		System.out.println("Battery object created");
	}
	
	public void toCheckBatteryCapacity() {
		System.out.println(this.capacity.hashCode() + "Hash code ref of capacity");
	}
	
	
}
