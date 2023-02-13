package com.xworkz.eggapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.eggapp.dto.EggDto;
import com.xworkz.eggapp.service.EggService;

@Controller
@RequestMapping("/egg")
public class EggController {
	
	@Autowired
	private EggService service;

	public EggController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onOrder(EggDto dto, Model model) {
		System.out.println("Running onOrder " + dto);
		boolean saved = this.service.validateAndSave(dto);
		System.out.println(saved);
		return "index";
	}

}
