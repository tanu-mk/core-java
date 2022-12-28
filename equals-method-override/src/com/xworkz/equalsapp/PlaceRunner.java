package com.xworkz.equalsapp;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.equalsapp.dto.PlaceDTO;

public class PlaceRunner {
	
	public static void main(String[] args) {
		
		PlaceDTO placeDTO1 = new PlaceDTO("Mullayanagiri", "Chikmagalur", "Tourist Spot");
		PlaceDTO placeDTO2 = new PlaceDTO("Bellur and Halebidu", "Belur", "Temple");
		PlaceDTO placeDTO3 = new PlaceDTO("Nagarahole Tiger Reserve", "Hunsur", "National Park");
		PlaceDTO placeDTO4 = new PlaceDTO("Jog Falls", "Shivmoga", "Waterfall");
		PlaceDTO placeDTO5 = new PlaceDTO("Murudeshwara", "Mangalore", "Beach");
		
		boolean equals = placeDTO1.equals(placeDTO5);
		System.out.println(equals);
		
		System.out.println("=============================");
		
		Collection<PlaceDTO> dto = new ArrayList<PlaceDTO>();
		dto.add(placeDTO5);
		dto.add(placeDTO4);
		dto.add(placeDTO3);
		dto.add(placeDTO2);
		dto.add(placeDTO1);
		
		boolean contains = dto.contains(placeDTO3);
		System.out.println(contains);
		
		
	}

}
