package com.xworkz.interfaceapp.classapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.interfaceapp.interfaceapp.Fuel;

@Component
public class Petrol implements Fuel {
	


	@Override
	public void consume() {
		System.out.println("to consume petrol");
	}

}
