package com.xworkz.tanu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.tanu.Dto.CrackerDto;
import com.xworkz.tanu.service.CrackerService;

@RestController
@RequestMapping(value = "/cracker", produces = MediaType.APPLICATION_JSON_VALUE)
public class CrackerRestController {
	
	@Autowired
	private CrackerService crackerService;
	
	public CrackerRestController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@GetMapping
	public CrackerDto onGet(CrackerDto dto) {
		System.out.println("Running onGet in CrackerRestController");
		System.out.println("creckerDto" + dto);
		CrackerDto crackerDto = new CrackerDto(1, "Rocket", 45D, "Standard");
		return crackerDto;
	}
	
	@PostMapping
	public String onPost( @RequestBody  CrackerDto dto) {
		System.out.println("Running onGet in CrackerRestController");
		System.out.println("crackerDto" + dto);
		this.crackerService.save(dto);
		return "save success";
	}

	
	@GetMapping("/list")
	public List<CrackerDto> onList(CrackerDto dto) {
		System.out.println("Running getList in CrackerRestController");
		System.out.println("CrackerDto" + dto);
		
		List<CrackerDto> list = new ArrayList<CrackerDto>();
		list.add(new CrackerDto(2, "AtomBomb", 30D, "Ashoka"));
		list.add(new CrackerDto(3,"", 20D, "Standard"));
		
		return list;
		
	}
	
	
	
	
	
	
	
}
