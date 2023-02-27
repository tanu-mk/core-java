package com.xworkz.app.controller;

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

import com.xworkz.app.dto.TouristPlacesDto;
import com.xworkz.app.service.TouristService;


@Controller
@RequestMapping("/")
public class TouristController {
	
	
	@Autowired
	private TouristService touristService;
	
	List<String> states = Arrays.asList("Karnataka", "Kerala", "Tamil Nadu", "Goa", "Maharastra", "Andra Pradesh ", "Telangana", "Madya Pradesh", "Gujarat", "Rajasthan", "New Delhi");
	
	List<String> bestTimeToVisit = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
	
	
	public TouristController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@GetMapping("/myWish")
	public String onTourist(Model model) {
		System.out.println("Running onTourist in Get Method ");
		model.addAttribute("state", states);
		model.addAttribute("bestTimeToVisit", bestTimeToVisit);
		return "touristPlaces";
	}
	
	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running on search for id " + id);
		
		TouristPlacesDto dto = this.touristService.findById(id);
		if(dto != null) {
			model.addAttribute("dto", dto);
		}
		else {
			model.addAttribute("message", "Data not found");
		}
		
		return "touristSearch";
	}
	
	
	@PostMapping("/myWish")
	public String onTourist(TouristPlacesDto dto, Model model) {
		
		Set<ConstraintViolation<TouristPlacesDto>> violations = this.touristService.validateAndSave(dto);
		
		if(violations.isEmpty()) {
			System.out.println("No violation in Controller go to success page");
			return "touristSuccess";
		}
		
		model.addAttribute("state", states);
		model.addAttribute("bestTimeToVisit", bestTimeToVisit);
		
		model.addAttribute("error", violations);
		model.addAttribute("dto", dto);
		
		System.err.println("Violation in Controller");
		
		return "touristPlaces";
			
	}

}
