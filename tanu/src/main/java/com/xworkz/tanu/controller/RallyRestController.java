package com.xworkz.tanu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.tanu.Dto.RallyDto;

@RestController
@RequestMapping(value="/rally", produces=MediaType.APPLICATION_JSON_VALUE)
public class RallyRestController {
	
	public RallyRestController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@GetMapping
	public RallyDto onGet(RallyDto dto) {
		System.out.println("Running onGet in RallyRestController");
		System.out.println("Created dto " + dto);
		
		RallyDto rallyDto = new RallyDto(1, "Go-Getters", 14.5, 200);
		return rallyDto;
	}
	
	@PostMapping
	public String onPost(RallyDto dto) {
		System.out.println("Running onPost in RallyRestController");
		System.out.println("Created dto " + dto);
		return "save success";
		
	}
	
	@GetMapping("/list")
	public List<RallyDto> onList(RallyDto dto){
		System.out.println("Running onList in RallyRestController");
		System.out.println("Created dto " + dto);
		
		List<RallyDto> list = new ArrayList<RallyDto>();
		list.add(new RallyDto(2, "Scenic Routes", 22.2, 304));
		list.add(new RallyDto(2, "Automagic", 12.2, 424));
		
		return list;
	}

}
