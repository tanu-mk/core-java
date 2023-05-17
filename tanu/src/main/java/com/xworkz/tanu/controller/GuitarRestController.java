package com.xworkz.tanu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.tanu.Dto.GuitarDto;

@RestController
@RequestMapping( value = "/guitar", produces = MediaType.APPLICATION_JSON_VALUE)
public class GuitarRestController {
	
	public GuitarRestController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@GetMapping
	public GuitarDto onGet(GuitarDto dto) {
		System.out.println("Running onGet in GuitarRestController");
		System.out.println("Created " + this.getClass().getSimpleName());
		
		GuitarDto guitarDto = new GuitarDto(1, "RoseWood", 34, 6);
		
		return guitarDto;
	}
	
	@PostMapping
	public String onPost(GuitarDto dto) {
		System.out.println("Running onPost in GuitarRestController");
		System.out.println("Created " + this.getClass().getSimpleName());
		return "save success";
		
	}
	
	@GetMapping("/list")
	public List<GuitarDto> onList(GuitarDto dto){
		System.out.println("Running onList in GuitarRestController");
		System.out.println("Created " + this.getClass().getSimpleName());
		
		List<GuitarDto> list = new ArrayList<GuitarDto>();
		list.add( new GuitarDto(2, "TeakWood", 56, 6));
		list.add( new GuitarDto(3, "SandalWood", 76, 6));
		
		return list;
		
		
	}

}
