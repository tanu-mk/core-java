package com.xworkz.chatsapp.controller;

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

import com.xworkz.chatsapp.dto.ChatsDto;
import com.xworkz.chatsapp.service.ChatsService;


@Controller
@RequestMapping("/")
public class ChatsController {
	
	@Autowired
	private ChatsService chatsService;
	
	List<String> chatNames = Arrays.asList("Panipuri", "Masalapuri", "Dahipuri", "Gobi", "FriedRice", "French Fries", "Noodles");
	
	List<String> types = Arrays.asList("South Indian", "North Indian", "Chinese", "Thai", "Rajasthani", "Punjabi", "Bengali");
	
	public ChatsController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@GetMapping("/chats")
	public String onChats(Model model) {
		System.out.println("Running onChats in get method");
		model.addAttribute("types", types);
		model.addAttribute("chatNames", chatNames);
		return "chats";
		
	}
	
	
	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running on search for id " + id);
		
		ChatsDto dto = this.chatsService.findById(id);
		if(dto != null) {
			model.addAttribute("dto", dto);
		}
		else {
			model.addAttribute("message", "Data not found");
		}
		
		return "chatsSearch";
	}
	
	
	@PostMapping("/chats")
	public String onChats(ChatsDto dto, Model model) {
		Set<ConstraintViolation<ChatsDto>> violations = this.chatsService.validateAndSave(dto);

		if (violations.isEmpty()) {
			System.out.println("No violation in controller go to success page");
			return "chatsSuccess";
		}

		model.addAttribute("types", types);
		model.addAttribute("chatNames", chatNames);
		
		model.addAttribute("error", violations);
		model.addAttribute("dto", dto);

		System.err.println("Violation in Controller");

		return "chats";

	}
		
		
	}


