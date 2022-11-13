package com.airport.app;

public class Airport {
	
	static String airportNames[] = {null, null, null, null, null};
	static int t;
	
	public static boolean saveAirportNames(String airportName) {
		
		airportNames[t] = airportName;
			t++;
		
	return false;
		
	}
	
	
	public static void getAirportNames() {
		
		for(int t=0; t<airportNames.length; t++) {
			
			String ref = airportNames[t];
			System.out.println("Airport name is" + ref);
		}
	}

}
