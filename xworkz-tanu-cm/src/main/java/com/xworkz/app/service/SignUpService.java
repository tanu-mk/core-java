package com.xworkz.app.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.app.dto.SignUpDto;


public interface SignUpService {

	Set<ConstraintViolation<SignUpDto>> validateAndSave(SignUpDto dto);
	
	default SignUpDto findByIdAndPassword(String userId, String password) {
		return null;
	}
	
	boolean sendMail(String email); //for sending email
	
	default Long findByUser(String user) {
		return null;
	}
	
	default Long findByEmail(String email) {
		return null;
	}

	
	default Long findByMobile(Long mobile) {
		 return null;
	 }
	
	
}
