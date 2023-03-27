package com.xworkz.app.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.app.dto.SignUpDto;


public interface SignUpService {

	Set<ConstraintViolation<SignUpDto>> validateAndSave(SignUpDto dto);
	
	
}
