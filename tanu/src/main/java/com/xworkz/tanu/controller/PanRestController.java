package com.xworkz.tanu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.tanu.Dto.PanDto;

@RestController
@RequestMapping( value = "/pan", produces = MediaType.APPLICATION_JSON_VALUE)
public class PanRestController {
	
	public PanRestController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@GetMapping
	public PanDto onGet(PanDto dto) {
		System.out.println("Running onGet in PanRestController");
		System.out.println("Created " + dto);
		
		PanDto panDto = new PanDto(1, "Rakesh", "ANUPK1876G", "Hassan");
	
		return panDto;
	}
	
	@PostMapping
	public String onPost(PanDto dto) {
		System.out.println("Running onPost in PanRestController");
		System.out.println("Created " + dto);
		return "save success";
	}
	
	
	@GetMapping("/list")
	public List<PanDto> onList(PanDto dto){
		System.out.println("Running onList in PanRestController");
		System.out.println("Created " + dto);
		
		List<PanDto> list = new ArrayList<PanDto>();
		list.add(new PanDto(2, "Manoj", "MMKP8976G", "ManjunathNagar"));
		list.add(new PanDto(2, "Deepa", "DPSR5643R", "Ramnagar"));
		
		return list;
		
	}
	

}
