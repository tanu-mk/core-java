package com.xworkz.terroristapp.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.Validator;

import com.xworkz.terroristapp.DTO.TerroristDTO;

import io.quarkus.hibernate.validator.runtime.ValidatorProvider;
import lombok.Setter;

public class TerroristServiceImpl implements TerroristService {
	
	public TerroristServiceImpl() {
		
		System.out.println("Created TerroristServiceImpl using no-args constructor");
	}

	@Override
	public boolean validateAndSave(TerroristDTO dto) {
		System.out.println("Running validateAndSave");
		System.out.println("Dto passed " + dto);
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<TerroristDTO>> violations = validator.validate(dto);
		if(!violations.isEmpty()) {
			System.err.println("Error is there");
			violations.forEach(c -> System.err.println(c.getMessage()));
		return false;
		}
		System.out.println("No validation Errors");
		return true;
	}
	
	
	
	
	
	

}
