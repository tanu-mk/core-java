package com.xworkz.equalsapp;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.equalsapp.dto.GameDTO;

public class GameRunner {
	
	public static void main(String[] args) {
		
		GameDTO gameDTO1 = new GameDTO("Kabadi", "Outdoor", 7 );
		GameDTO gameDTO2 = new GameDTO("Football", "Outdoor", 11 );
		GameDTO gameDTO3 = new GameDTO("Cricket", "Outdoor", 11 );
		GameDTO gameDTO4 = new GameDTO("Table Tennis", "Indoor", 2 );
		GameDTO gameDTO5 = new GameDTO("Tennis", "Indoor", 2 );
		GameDTO gameDTO6 = new GameDTO("Football", "Outdoor", 11 );
		
		boolean equals = gameDTO2.equals(gameDTO6);
		System.out.println(equals);
		
		System.out.println("===========================");
		
		boolean equals1 = gameDTO4.equals(gameDTO3);
		System.out.println(equals1);
		
		System.out.println("===========================");
		
		Collection<GameDTO> collection = new ArrayList<GameDTO>();
		collection.add(gameDTO6);
		collection.add(gameDTO5);
		collection.add(gameDTO4);
		collection.add(gameDTO3);
		collection.add(gameDTO2);
		collection.add(gameDTO1);
		
		boolean ref = collection.contains(gameDTO2);
		System.out.println(ref);
	}

}
