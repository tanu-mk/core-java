package com.xworkz.valentineapp.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.valentineapp.dto.ValentineDto;

public interface ValentineService {
	
	Set<ConstraintViolation<ValentineDto>> validateAndSave(ValentineDto dto);
	
	default ValentineDto findById(int id) {
		return null;
	}

}
