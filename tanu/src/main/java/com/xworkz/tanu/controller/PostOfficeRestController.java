package com.xworkz.tanu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.tanu.Dto.PostOfficeDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping(value="/office",  produces = MediaType.APPLICATION_JSON_VALUE)
public class PostOfficeRestController {
	
	public PostOfficeRestController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@GetMapping
	public PostOfficeDto onGet(PostOfficeDto dto) {
		System.out.println("Running get on PostOfficeRestController");
		System.out.println("created dto " + dto);
		
		PostOfficeDto postOfficeDto = new PostOfficeDto(1, "Industrial Area", "Rajajinagar", "inland");
		return postOfficeDto;
	}
	
	@PostMapping
	public String onPost(PostOfficeDto dto) {
		System.out.println("Running get on PostOfficeRestController");
		System.out.println("created dto " + dto);
		return "save success";
		
	}
	
	@GetMapping("/list")
	public List<PostOfficeDto> list(PostOfficeDto dto){
		System.out.println("Running get on PostOfficeRestController");
		System.out.println("created dto " + dto);
		
		List<PostOfficeDto> list = new ArrayList<PostOfficeDto>();
		list.add(new PostOfficeDto(2, "Sub-Industrial", "Peenya", "Speed Post"));
		list.add(new PostOfficeDto(3, "Hal", "Marathahalli", "Regular Post"));
		
		return list;
		
	}
	

}
