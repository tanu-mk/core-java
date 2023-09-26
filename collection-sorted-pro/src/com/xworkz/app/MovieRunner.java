package com.xworkz.app;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.app.dto.MovieDto;

public class MovieRunner {
	
	public static void main(String[] args) {

		MovieDto movieDto1=new MovieDto("kantara", 10D, "pan", 400D, LocalDateTime.of(2022, 2, 05, 00, 00));
		MovieDto movieDto2=new MovieDto("ulidavaru kandantte", 5D, "kannada", 40D, LocalDateTime.of(2018, 4, 06, 00, 00));
		MovieDto movieDto3=new MovieDto("bell bottom", 6D, "tulu", 45D, LocalDateTime.of(2021, 04, 07, 00, 00));
		MovieDto movieDto4=new MovieDto("kasargodu", 7D, "kannada", 48D, LocalDateTime.of(2020, 02, 01, 00, 00));
		MovieDto movieDto5=new MovieDto("hkgk", 15D, "konkani", 20D, LocalDateTime.of(2021, 3, 05, 00, 00));

		List<MovieDto> list=new LinkedList<MovieDto>();
		list.add(movieDto5);
		list.add(movieDto4);
		list.add(movieDto3);
		list.add(movieDto2);
		list.add(movieDto1);

		list.stream()
		.sorted((a1,a2)->a2.getName().compareTo(a1.getName()))
	    .forEach(element->System.out.println(element));
		System.out.println(System.lineSeparator());
		list.stream()
		.sorted((a1,a2)->a1.getBudget().compareTo(a2.getBudget()))
		.forEach(element->System.out.println(element));
		System.out.println(System.lineSeparator());


	}
	
	
	
	

}
