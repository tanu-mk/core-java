package com.xworkz.streamapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.streamapp.dto.ApplicationDTO;

public class ApplicationRunner {
	
	public static void main(String[] args) {
		
		Collection<ApplicationDTO> application = new ArrayList();
		application.add(new ApplicationDTO("App Sheet", 3.2d, true, "Google", "100 Dollars" ));
		application.add(new ApplicationDTO("Quixy", 17d, true, "Oracle", "230 Dollars" ));
		application.add(new ApplicationDTO("Zoho Creator", 18d, false, "Google", "120 Dollars" ));
		
		
		
		//applicationDTO where version greater than 5 and collect only name
		 application
		.stream()
		.filter(dto -> dto.version > 5)
		.map(dto -> dto.getName())
		.collect(Collectors.toList())
		.forEach(ele -> System.out.println(ele));
		
		System.out.println("=====================================");
		
		//applicationDTO which is free and developed by google
		 application
		.stream()
		.filter(dto -> dto.isFree)
		.filter(dto -> dto.developedBy == "Google")
		.collect(Collectors.toList())
		.forEach(ele -> System.out.println(ele));
		
		
		
		
		
	}

}
