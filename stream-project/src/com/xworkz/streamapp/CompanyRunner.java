package com.xworkz.streamapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.streamapp.dto.CompanyCEODTO;

public class CompanyRunner {
	
	public static void main(String[] args) {
		
		Collection<CompanyCEODTO> company = new ArrayList();
		company.add(new CompanyCEODTO("Sagar", "Google", 45, "India", "BE", true));
		company.add(new CompanyCEODTO("Deepa", "Facebook", 27, "USA", "MBA", true));
		company.add(new CompanyCEODTO("Anu", "Accenture", 65, "Canada", "MCA", true));
		
		//Print details of CompanyCEODTO's daughterDTO
		
		
		
		
		
		
		System.out.println("=============================================");
		
		//get total CompanyCEODTO where age is greater than 30
		 company
		.stream()
		.filter(dto -> dto.age > 30)
		.collect(Collectors.toList())
		.forEach(ele -> System.out.println(ele));
		
		System.out.println("=============================================");
		
		
		//Print below format from CompanyCEODTO
		//Father Age : 7, Daughter Age : 0
		
	}

}
