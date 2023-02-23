package com.xworkz.aeroplaneapp.controller;

import java.util.Arrays;  
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.aeroplaneapp.dto.AeroplaneDto;
import com.xworkz.aeroplaneapp.service.AeroplaneService;


@Controller
@RequestMapping("/")
public class AeroplaneController {
	
	@Autowired
	private AeroplaneService aeroplaneService;
	
	
	List<String> types = Arrays.asList("Airbus A380", "Airliner", "Boeing", "Freighter", "Business jet");
	
	List<String> country = Arrays.asList("India", "Sri Lanka", "Russia", "USA", "Australia", "Paris", "Canada", "France");
	
	
	public AeroplaneController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	
	@GetMapping("/aeroplane")
	public String onPlane(Model model) {
		System.out.println("Running onPlane in get method.....");
		model.addAttribute("type", types);
		model.addAttribute("country", country);
		
		return "aeroplane";
	}
	
	
	
	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running on search for id " + id);
		
		AeroplaneDto dto = this.aeroplaneService.findById(id);
		if(dto != null) {
			model.addAttribute("dto", dto);
		}
		else {
			model.addAttribute("message", "Data not found");
		}
		
		return "aeroplaneSearch";
	}
	
	
	
	
	
	
	@PostMapping("/aeroplane")
	public String onPlane(AeroplaneDto dto, Model model) {
		Set<ConstraintViolation<AeroplaneDto>> violations = this.aeroplaneService.validateAndSave(dto);
		
		if(violations.isEmpty()) {
			System.out.println("No violation in controller go to success page");
			model.addAttribute("dto", dto);
			return "aeroplaneSuccess";
		}
		
		model.addAttribute("type", types);
		model.addAttribute("country", country);
		
		model.addAttribute("error", violations);
		model.addAttribute("dto", dto);
		
		return "aeroplane";
	}
	

}
