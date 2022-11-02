package com.airport.app;

public class AirportTester {
	
	public static void main(String t[]) {
	
		Airport.saveAirportNames("Kempegowda International Airport, Bangalore");
		Airport.saveAirportNames("Netaji Subhash Chandra Bose International Airport , Kolkata");
		Airport.saveAirportNames("Sardar Vallah Bhai Patel International Airport, Ahmedabad");
		Airport.saveAirportNames("Guru RamDass Jee International Airport, Amritsar");
		Airport.saveAirportNames("Lokpriya Gopinath Bordoloi International Airport, Guwahati");

		
		Airport.getAirportNames();

}

}