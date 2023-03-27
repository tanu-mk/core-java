package com.xworkz.app.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.app.dto.SignUpDto;
import com.xworkz.app.service.SignUpService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class SignUpController {
	
	
	private SignUpService signUpService;
	
	
	
	@PostMapping("/unique")
	public String onSignUp(SignUpDto dto, Model model) {
		
		Set<ConstraintViolation<SignUpDto>> violations = this.signUpService.validateAndSave(dto);
		
		if(violations.isEmpty()) {
			log.info("No violation in Controller go to success page");
			return "SignUp";
		}
		
		model.addAttribute("error", violations);
		model.addAttribute("dto", dto);
		
		log.info("Violation in Controller");
		
		return "SignUp";
		
		
	}

}
