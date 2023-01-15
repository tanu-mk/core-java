package com.xworkz.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CameraMan {
	
	@Autowired
	public Camera camera;

	public CameraMan() {
		
		System.out.println(" CameraMan Object is created");
	}
	
	public void featuresOfCamera() {
		
		System.out.println(this.camera.hashCode());
	}
}
