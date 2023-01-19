package com.xworkz.spring.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.ResortDto;
import com.xworkz.spring.repo.ResortRepo;

@Component
public class ResortServiceImpl implements ResortService{
	
	@Autowired
	private Validator validator;
	private ResortRepo resortRepo;
	
	
	public ResortServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Autowired
	public ResortServiceImpl(ResortRepo resortRepo) {
		this.resortRepo = resortRepo;
	}
	
	
	@Override
	public boolean validateAndSave(ResortDto dto) {
		System.out.println("Running validateAndSave");
		System.out.println("ResortDto " + dto);
		
		Set<ConstraintViolation<ResortDto>> violations = this.validator.validate(dto);
		
		if(!violations.isEmpty()) {
			System.out.println("Validation as Errors");
			violations.forEach(str -> System.out.println(str.getMessage()));
			return false;
		}else {
			System.out.println("Data is valid...");
			boolean saved = this.resortRepo.save(dto);
			System.out.println("Saved " + saved);
			return saved;
		}
		
	}

}
