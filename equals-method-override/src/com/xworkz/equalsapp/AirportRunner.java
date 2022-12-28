package com.xworkz.equalsapp;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.equalsapp.dto.AirportDTO;

public class AirportRunner {

	public static void main(String[] args) {
		
		AirportDTO airportDTO1 = new AirportDTO("Kempegowda International Airport", "Bangalore", 800 );
		AirportDTO airportDTO2 = new AirportDTO("Chennai International Airport", "Chennai", 30 );
		AirportDTO airportDTO3 = new AirportDTO("Indira Gandhi International Airport", "NewDelhi", 200 );
		AirportDTO airportDTO4 = new AirportDTO("Rajiv Gandhi International Airport", "Mumbai", 300 );
		AirportDTO airportDTO5 = new AirportDTO("Dabolim Airport", "Goa", 30 );
		
		boolean equals = airportDTO3.equals(airportDTO5);
		System.out.println(equals);
		
		System.out.println("====================================");
		
		Collection<AirportDTO> collection = new ArrayList<AirportDTO>();
		collection.add(airportDTO5);
		collection.add(airportDTO4);
		collection.add(airportDTO3);
		collection.add(airportDTO2);
		collection.add(airportDTO1);
		
		boolean contains = collection.contains(airportDTO5);
		System.out.println(contains);
		
	}
}
