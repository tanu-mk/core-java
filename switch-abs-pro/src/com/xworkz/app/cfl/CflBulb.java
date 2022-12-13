package com.xworkz.app.cfl;

import com.xworkz.app.SwitchCase;

public class CflBulb implements SwitchCase {

	@Override
	public void sOn() {
		System.out.println("Cfl bulb id turned on");
		
	}

	@Override
	public void sOff() {
		System.out.println("Cfl bulb is turned off");
		
	}

}
