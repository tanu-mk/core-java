package com.xworkz.interfaceapp.classapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.interfaceapp.interfaceapp.Fuel;
import com.xworkz.interfaceapp.interfaceapp.PetrolBunk;

@Component
public class Shell implements PetrolBunk {
	
	@Autowired
	@Qualifier("petrol")
	private Fuel fuel;

	@Override
	public void toPurchase() {
		System.out.println("toPurchase from shell");
		fuel.consume();
	}

}
