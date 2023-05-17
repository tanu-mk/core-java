package com.xworkz.tanu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.tanu.Dto.ElectionDto;

@RestController
@RequestMapping(value = "/election", produces = MediaType.APPLICATION_JSON_VALUE)
public class ElectionRestController {
	
	public ElectionRestController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@GetMapping
	public ElectionDto onGet(ElectionDto dto) {
		System.out.println("Running onGet in ElectionRestController");
		System.out.println("Created dto " + dto);
		
		ElectionDto electionDto = new ElectionDto(1,"BJP", "T Dasarahalli", 1030);
		
		return electionDto;
	}
	
	@PostMapping
	public String onPost(ElectionDto dto) {
		System.out.println("Running onPost in ElectionRestController");
		System.out.println("Created dto " + dto);
		return "save success";
	}

	
	@GetMapping("/list")
	public List<ElectionDto> onGetList(ElectionDto dto){
		System.out.println("Running onGetList in ElectionRestController");
		System.out.println("Created dto " + dto);
		
		List<ElectionDto> list = new ArrayList<ElectionDto>();
		list.add(new ElectionDto(2, "Congress", "Rajajinagar", 2001));
		list.add(new ElectionDto(3, "JDS", "Vidyaranyapura", 3090));
		
		return list;
		
		
		
	}
	
	
	
}
