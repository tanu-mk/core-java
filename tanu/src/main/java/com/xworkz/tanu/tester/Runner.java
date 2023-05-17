package com.xworkz.tanu.tester;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manu")

public class Runner {
	
	public Runner() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
	
	@GetMapping(produces = "application/json")
	public String onRunner() {
		System.out.println("Running onRunner........");
		
		return "Welcome to spring boot class";
	}

}
