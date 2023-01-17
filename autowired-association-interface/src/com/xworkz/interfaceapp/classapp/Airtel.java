package com.xworkz.interfaceapp.classapp;

import org.springframework.stereotype.Component;

import com.xworkz.interfaceapp.interfaceapp.Provider;

@Component
public class Airtel implements Provider {

	@Override
	public void connect() {
		System.out.println("running connect method in Airtel");
	
	}
	

}
