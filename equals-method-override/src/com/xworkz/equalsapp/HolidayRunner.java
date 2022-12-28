package com.xworkz.equalsapp;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.equalsapp.dto.HolidayDTO;

public class HolidayRunner {
	
	public static void main(String[] args) {
		
		HolidayDTO dto1 = new HolidayDTO("Summer Vacation", "April", 30);
		HolidayDTO dto2 = new HolidayDTO("Ganesh Chaturthi", "September", 4);
		HolidayDTO dto3 = new HolidayDTO("Deepavali", "November", 5);
		HolidayDTO dto4 = new HolidayDTO("Dasara", "October", 9);
		HolidayDTO dto5 = new HolidayDTO("Christmas", "December", 9);
		
		boolean equals = dto4.equals(dto5);
		System.out.println(equals);
		
		System.out.println("==============================");
		
		Collection<HolidayDTO> ref = new LinkedList<HolidayDTO>();
		ref.add(dto5);
		ref.add(dto4);
		ref.add(dto3);
		ref.add(dto2);
		ref.add(dto1);
		
		boolean contains = ref.contains(dto5);
		System.out.println(contains);
		
		
	}

}
