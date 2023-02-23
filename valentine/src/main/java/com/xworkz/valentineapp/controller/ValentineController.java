package com.xworkz.valentineapp.controller;

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

import com.xworkz.valentineapp.dto.ValentineDto;
import com.xworkz.valentineapp.service.ValentineService;

@Controller
@RequestMapping("/")
public class ValentineController {
	
	
	@Autowired
	private ValentineService valentineService;

	List<String> places = Arrays.asList("Cubbon Park", "BTM", "Nandi Hills", "Lal Bagh", "Sankey Tank", "Hebbala");

	List<String> gifts = Arrays.asList("Teddy", "Chocolate", "I-phone", "Saree");

	public ValentineController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping("/valentine")
	public String onValentine(Model model) {
		System.out.println("Running onValentine Get method");
		model.addAttribute("place", places);
		model.addAttribute("gift", gifts);	
		return "valentine";
	}
	

	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running on search for id " + id);
		
		ValentineDto dto = this.valentineService.findById(id);
		if(dto != null) {
			model.addAttribute("dto", dto);
		}
		else {
			model.addAttribute("message", "Data not found");
		}
		
		return "valentineSearch";
	}
	

	@PostMapping("/valentine")
	public String onValentine(ValentineDto dto, Model model) {
		Set<ConstraintViolation<ValentineDto>> violations = this.valentineService.validateAndSave(dto);

		if (violations.isEmpty()) {
			System.out.println("No violation in controller go to success page");
			return "valentineSuccess";
		}

		model.addAttribute("place", places);
		model.addAttribute("gift", gifts);
		
		model.addAttribute("error", violations);
		model.addAttribute("dto", dto);

		System.err.println("Violation in Controller");

		return "valentine";

	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
