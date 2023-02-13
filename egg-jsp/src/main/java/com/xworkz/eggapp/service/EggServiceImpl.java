package com.xworkz.eggapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.eggapp.dto.EggDto;
import com.xworkz.eggapp.repository.EggRepository;

@Service
public class EggServiceImpl implements EggService {
	
	
	@Autowired
	private EggRepository eggRepository;
	
	
	public EggServiceImpl() {
		System.out.println("Running EggServiceImpl");
	}
	
	
	@Override
	public boolean validateAndSave(EggDto dto) {
		System.out.println("Running validate and save in service " + dto);
		boolean saved = this.eggRepository.save(dto);
		System.out.println("Saved " + saved);
		return saved;
		
		
	}

}
