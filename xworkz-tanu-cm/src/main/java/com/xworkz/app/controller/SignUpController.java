package com.xworkz.app.controller;

import java.time.LocalTime;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
	public String userSignIn(String userId, String password, Model model,HttpServletRequest request) {
		log.info("Running in userSignIn condition ");
		try {
			SignUpDto dto = this.signUpService.userSignIn(userId, password);
			log.info("Login count" + dto.getLockCount());
			if (dto.getLockCount() >= 3) {
				model.addAttribute("msg", "Account locked Reset password");
				log.info("Acount locked due to 3 attempts");
				return "SignIn";
			}
			
			if (dto != null) {

				if (dto.getResetPassword() == true) {
					log.info("Running in ResetPassword true condition");
					if (!dto.getPasswordChangedTime().isAfter(LocalTime.now())) {
						log.info("Running in time warifying condition");
						model.addAttribute("msgs", "Time out plz try again after sometime");
						return "SignIn";
					}
					model.addAttribute("userID", dto.getUserId());
					log.info("Running in reset condition");
					log.info("ResetPassword---" + dto.getResetPassword());
					log.info("Timer-----" + dto.getPasswordChangedTime().isAfter(LocalTime.now()));
					return "UpdatePassword";
				}
				
				//System.currentTimeMillis();
				log.info("User ID and password is matched");
				HttpSession httpSession= request.getSession(true);
				httpSession.setAttribute("userID", dto.getUserId());
				return "PasswordSuccess";
			}
		} catch (Exception e) {
			log.info(e.getMessage());
		}
		log.info("UserID OR Password is not matching");
		model.addAttribute("msg", "UserID OR Password is not matching");
		return "SignIn";
	}
	
	
	
	@PostMapping("/reset")
	public String resetPassword(String email, Model model) {
		try{
			SignUpDto dto = this.signUpService.resetPassword(email);
			if(dto.getResetPassword() == true) {
				model.addAttribute("message", "Password reset successfull plz login within 2 min with otp");
				model.addAttribute("message", "Password reset successful plz login within 2 min with otp");
				return "ResetPassword";
			}
		}catch (Exception e) {
			log.info(e.getMessage());
		}			
		return "ResetPassword";
	}
	
	
	
	@PostMapping("/passwordUpdate")
	public String updatePassword(String userId, String password, String confirmPassword) {
		log.info("Running in updatePassword method");
		this.signUpService.updatePassword(userId, password, confirmPassword);
		return "PasswordSuccess";
	}
	
}
	
	
	


