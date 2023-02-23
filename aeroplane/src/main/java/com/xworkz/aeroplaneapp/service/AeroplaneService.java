package com.xworkz.aeroplaneapp.service;



import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.aeroplaneapp.dto.AeroplaneDto;


public interface AeroplaneService {
	
	Set<ConstraintViolation<AeroplaneDto>> validateAndSave(AeroplaneDto dto);
	
	default AeroplaneDto findById(int id) {
		return null;
	}

}
