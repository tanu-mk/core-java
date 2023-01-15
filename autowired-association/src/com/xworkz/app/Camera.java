package com.xworkz.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	
	@Autowired
	private Battery battery;
	private int lens;
	

	public Camera() {
		System.out.println("created camera--------");
	}

	public void toCheckBattery() {
		System.out.println(this.battery.hashCode() +"hashcode of ref battery");
	}
	
	

}
