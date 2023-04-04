package com.xworkz.app.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.app.dto.SignUpDto;
import com.xworkz.app.service.SignUpService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class SignUpController {
	
	
	@Autowired
	private SignUpService signUpService;
	
	
	public SignUpController() {
		System.out.println("created " + this.getClass().getSimpleName());
	}
	
	
	@PostMapping("/unique")
	public String onSignUp(SignUpDto dto, Model model) {
		
		if(dto.getPassword().equals(dto.getConfirmPassword())) {
		Set<ConstraintViolation<SignUpDto>> violations = this.signUpService.validateAndSave(dto);
		
			if(violations == null) {
				model.addAttribute("AlreadyExist", "UserId or Email or Mobile already exist");
				return "SignUp";
			}
	
			if(violations.isEmpty() && violations != null) {
				model.addAttribute("message", "data saved successfully");
				log.info("" + dto);
				return "SignUp";
		}
		else {
			model.addAttribute("error", violations);
			model.addAttribute("dto", dto);
		}
			return "SignUp";
		}else {
			model.addAttribute("password", "Password and confirmed password must be same");
		}
		return "SignUp";
		
	}
	
	
	@PostMapping("/special")
	public String userSignIn(String userId, String password, Model model) {
		try {
		SignUpDto dto = this.signUpService.findByIdAndPassword(userId, password);
		if (dto!=null) {
			log.info("User ID and password is matched");
			model.addAttribute("userID",dto.getUserId());
			return "LoginSuccess";
		}
		}
		catch (Exception e) {
		}
			model.addAttribute("msg", "UserID OR Password is not matching");
			return "SignIn";			

	}
	
	
	

}
