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
	
	@GetMapping("/searchByDestination")
	public String onSearchByDestination(@RequestParam String destination, Model model) {
		System.out.println("Running onSearchByDestination in controller " + destination);
		List<TouristPlacesDto> list = this.touristService.findByDestination(destination);
		model.addAttribute("lists", list);
		return "searchByDestinationName";
	}
	
	
	@GetMapping("/delete")
	public String onDelete(@RequestParam int id, Model model) {
		this.touristService.delete(id);
		return "searchByDestinationName";
		
	}	

	
	@GetMapping("/updateByDestination")
	public String onUpdate(@RequestParam int id, Model model) {
		System.out.println("Running onUpdate " + id);
		TouristPlacesDto dto = this.touristService.findById(id);
		model.addAttribute("dto", dto);
		model.addAttribute("state", states);
		model.addAttribute("bestTimeToVisit", bestTimeToVisit);
		return "updateByDestination";
		
	}
	
	
	@PostMapping("/updateByDestination")
	public String onUpdate(TouristPlacesDto dto, Model model) {
		System.out.println("Running onUpdate "  + dto);
		Set<ConstraintViolation<TouristPlacesDto>> violations = this.touristService.validateAndUpdate(dto);
		if(violations.size() > 0) {
			model.addAttribute("errors", violations);
		}
		else {
			model.addAttribute("message", "TouristPalce update success");
		}
		return "updateByDestination";
	}	

	
	@GetMapping("/list")
	public String onList(Model model) {
		System.out.println("Running onList in controller...");
		List<TouristPlacesDto> list = this.touristService.findByAll();
		if(list != null && !list.isEmpty()) {
			model.addAttribute("list", list);
		}else {
			model.addAttribute("message" , "no data found in db");
		}
		return "findByAll";
	}
	
	
	@GetMapping("/findByTwoProperties")
	public String onFindByDestinationAndState(@RequestParam String destination, @RequestParam String state, Model model) {
		System.out.println("Running onFindByDestinationAndState in controller...");
		List<TouristPlacesDto> list = this.touristService.findByDestinationAndState(destination, state);
		if(destination != null && !destination.isEmpty() || state != null && !state.isEmpty() ) {
			model.addAttribute("arrayList", list);
		}else {
			List<TouristPlacesDto> list1 = this.touristService.findByDestinationAndState(destination, state);
		}
		return "findByDestinationAndState";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
