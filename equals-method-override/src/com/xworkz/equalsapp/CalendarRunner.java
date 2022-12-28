package com.xworkz.equalsapp;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.equalsapp.dto.CalendarDTO;

public class CalendarRunner {
	
	public static void main(String[] args) {
		
		CalendarDTO dto1 = new CalendarDTO("febrauary", 28, 2);
		CalendarDTO dto2 = new CalendarDTO("March", 30, 4);
		CalendarDTO dto3 = new CalendarDTO("May", 31, 5);
		CalendarDTO dto4 = new CalendarDTO("October", 30, 8);
		CalendarDTO dto5 = new CalendarDTO("December", 31, 7);
		
		boolean equals = dto3.equals(dto5);
		System.out.println(equals);
		
		System.out.println("=====================================");
		
		Collection<CalendarDTO> collection = new ArrayList<CalendarDTO>();
		collection.add(dto5);
		collection.add(dto4);
		collection.add(dto3);
		collection.add(dto2);
		collection.add(dto1);
		
		boolean contains = collection.contains(dto4);
		System.out.println(contains);
		
	}

}
