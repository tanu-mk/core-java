package com.xworkz.bigbasketapp.controller;

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

import com.xworkz.bigbasketapp.dto.BigBasketDto;
import com.xworkz.bigbasketapp.service.BigBasketService;

@Controller
@RequestMapping("/")
public class BigBasketController {
	
	@Autowired
	private BigBasketService bigBasketService;
	
	List<String> areas = Arrays.asList("Marathahalli", "Banashankari", "Yeshwanthpur", "Mahalakshmi Layout");
	
	List<String> itemList = Arrays.asList("Fruits", "Vegetables", "Perfumes", "Chocolates", "Biscuits");
	
	
	public BigBasketController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	
	@GetMapping("/basket")
	public String onBasket(Model model) {
		System.out.println("Running onBasket Get Method");
		model.addAttribute("areas", areas);
		model.addAttribute("itemList", itemList);
		return "bigbasket";
	}
	
	
	
	@PostMapping("/basket")
	public String onBasket(BigBasketDto dto, Model model) {
		Set<ConstraintViolation<BigBasketDto>> violations = this.bigBasketService.validateAndSave(dto);
		
		if (violations.isEmpty()) {
			System.out.println("No violation in controller go to success page");
			model.addAttribute("dto", dto);
			return "bigbasketSuccess";
		}
		
		model.addAttribute("areas", areas);
		model.addAttribute("itemList", itemList);
		
		model.addAttribute("error", violations);
		model.addAttribute("dto", dto);
		
		System.out.println("Violation in Controller");
		return "bigbasket";	
	}
	

}
