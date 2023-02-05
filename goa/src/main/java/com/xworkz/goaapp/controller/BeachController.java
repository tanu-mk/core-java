package com.xworkz.goaapp.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goaapp.dto.BeachDto;

@Component
@RequestMapping("/beach")
public class BeachController {
	
	public BeachController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String toEnjoy(BeachDto dto, Model model) {
		System.out.println("Running toEnjoy " + dto);
		model.addAttribute("name", dto.getName());
		model.addAttribute("location", dto.getLocation());
		model.addAttribute("clean", dto.isClean());
		model.addAttribute("games", dto.isGames());
		return "beachMsg.jsp";
	}

}
