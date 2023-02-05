package com.xworkz.goaapp.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goaapp.dto.CasinoDto;

@Component
@RequestMapping("/casino")
public class CasinoController {
	
	public CasinoController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String toGamble(CasinoDto dto, Model model) {
		System.out.println("Running toGamble " + dto);
		model.addAttribute("name" ,dto.getName() );
		model.addAttribute("cruise", dto.getCruise());
		model.addAttribute("entryFee", dto.getEntryFee());
		model.addAttribute("freeFood", dto.isFreeFood());
		model.addAttribute("freeAlcohol", dto.isFreeAlcohol());
		return "casinoMsg.jsp";
		
	}

}
