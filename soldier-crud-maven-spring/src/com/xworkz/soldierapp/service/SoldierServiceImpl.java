package com.xworkz.soldierapp.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.soldierapp.dto.SoldierDto;
import com.xworkz.soldierapp.repository.SoldierRepo;

public class SoldierServiceImpl implements SoldierService {
	
	private SoldierRepo soldierRepo;
	
	public SoldierRepo getSoldierRepo() {
		return soldierRepo;
	}
	public void setSoldierRepo(SoldierRepo soldierRepo) {
		this.soldierRepo = soldierRepo;
	}
	
	public SoldierServiceImpl() {
		System.out.println("Calling no-args constructor");
	}

	
	@Override
	public boolean validateAndSave(SoldierDto dto) {
		System.out.println("Running validateAndSave method");
		System.out.println("Dto " + dto);
		
		//factory
		//validator
		//validate
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDto>> violations = validator.validate(dto);
		
		if(!violations.isEmpty()) {
			System.out.println("There are Validator Errors");
			
			violations.forEach( ele -> {System.out.println("Violating message " + ele.getMessage());
			});
			
			return false;
		}
		else {
			System.out.println("Data is valid...");
			boolean saved = soldierRepo.save(dto);
			System.out.println("Dto is saved using repo " + saved);
			return saved;
		}
		

	}

	
		
	}


