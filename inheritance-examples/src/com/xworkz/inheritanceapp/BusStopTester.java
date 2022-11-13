package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.Base.BusStop;

public class BusStopTester {
	
	public static void main(String t[]) {
		
		BusStop bus = new BusStop();
		bus.forOnbardingBus("Vivekananda", "Brigade");
		
		BusStop bus9 = new BusStop();
		bus9.forOnbardingBus("Devegowda", "BTM");
	}

}
