package com.xworkz.eggapp.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.eggapp.dto.CMDTO;

public interface CMService {
	
	Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO cmdto);
	
	//return set: validation failed: false
	//return empty set: validation passed: true

}
