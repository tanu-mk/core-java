package com.xworkz.airportapp;

//import com.xworkz.airportapp.airport.Airport;
import com.xworkz.airportapp.airport.KiaAirport;
//import com.xworkz.airportapp.airport.Passport;
import com.xworkz.airportapp.airport.Passport;
import com.xworkz.airportapp.gender.Gender;

public class AirportTester {
	
	public static void main(String t[]) {
		
		Passport passport = new Passport("S2ST56873", "IND", "Manoj MK", Gender.Male);
		
		//Airport airport = new Airport();
		
		
		/*airport.isPassportAvailable = true;
		airport.isVisaAvailable = true;
		boolean isAllowed = airport.travel(passport);
		
		System.out.println("Is allowed to travel:" + isAllowed);*/
		
		KiaAirport kia = new KiaAirport();
		kia.isVisaAvailable = true;
		kia.laguage = 30;
		
		boolean isAllowed = kia.travel(passport);
		
		System.out.println("Finally all the check is done.....Allowed to travel: " + isAllowed);
		
		
		
		
		
		
	}

}
