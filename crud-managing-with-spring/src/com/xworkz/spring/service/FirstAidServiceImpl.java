package com.xworkz.spring.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.FirstAidDto;
import com.xworkz.spring.repo.FirstAidRepo;

@Component
public class FirstAidServiceImpl implements FirstAidService {
	
	@Autowired
	private FirstAidRepo firstAidRepo;
	private Validator validator;
	
	public FirstAidServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Autowired
	public FirstAidServiceImpl(Validator validator) {
		this.validator = validator;
	}
	
	
	@Override
	public boolean validateAndSave(FirstAidDto dto) {
		System.out.println("Running validateAndSave method");
		System.out.println("FirstAidDto " + dto);
		
		
  Set<ConstraintViolation<FirstAidDto>> violations = this.validator.validate(dto);
		
		if(!violations.isEmpty()) {
			System.err.println("There are validations errors");
			violations.forEach(ele -> System.out.println(ele.getMessage()));
			return false;
		}else {
			System.out.println("Data is Valid...");
			boolean saved = this.firstAidRepo.save(dto);
			System.out.println("Saved first aid dto " + saved);
			return saved;
		}
		
		
		
		
	}

	

}
