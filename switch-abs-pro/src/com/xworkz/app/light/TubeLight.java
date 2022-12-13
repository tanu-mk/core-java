package com.xworkz.app.light;

import com.xworkz.app.SwitchCase;

public class TubeLight implements SwitchCase {

	@Override
	public void sOn() {
		System.out.println("Tubelight is turned onn.....");
	}

	@Override
	public void sOff() {
		System.out.println("Tubelight is turned off....");
		
	}
	
	
	

}
