package com.xworkz.eggapp.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.eggapp.dto.CMDTO;
import com.xworkz.eggapp.service.CMService;

@Controller
@RequestMapping("/cm")
public class CMController {
	
	@Autowired
	private CMService cmservice;
	
	
	public CMController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	
	@PostMapping
	public String onCm(CMDTO cmdto, Model model) {
		System.out.println("Running onCm " + cmdto);
		
		Set<ConstraintViolation<CMDTO>> constraintViolations = this.cmservice.validateAndSave(cmdto);
		
		if(!constraintViolations.isEmpty()) {
			System.out.println("Validation Failed , Display error message");
			constraintViolations.forEach((cv) -> System.out.println(cv.getMessage()));
		}
		else {
			System.out.println("Validation Success, Display success message");
		}
		
		return "cm";
	}

}
