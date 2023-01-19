package com.xworkz.spring.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.MicelleDto;
import com.xworkz.spring.repo.MicelleRepo;

@Component
public class MicelleServiceImpl implements MicelleService {
	
	
	private MicelleRepo micelleRepo;
	@Autowired
	private Validator validator;
	
	public MicelleServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Autowired
	public MicelleServiceImpl(MicelleRepo micelleRepo) {
		this.micelleRepo = micelleRepo;
	}

	@Override
	public boolean validateAndSave(MicelleDto dto) {
		System.out.println("Running validateAndSave");
		System.out.println("MicelleDto " + dto);
		
		Set<ConstraintViolation<MicelleDto>> violations = this.validator.validate(dto);
		
		if(!violations.isEmpty()) {
			System.out.println("Validation as Errors");
			violations.forEach(ele -> System.out.println(ele.getMessage()));
			return false;
		}else {
			System.out.println("Data is valid...");
			boolean saved = this.micelleRepo.save(dto);
			System.out.println("Saved " + saved);
			return saved;
		}
		
		
	}

}
