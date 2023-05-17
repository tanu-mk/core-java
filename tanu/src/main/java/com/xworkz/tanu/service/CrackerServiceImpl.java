package com.xworkz.tanu.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.tanu.Dto.CrackerDto;
import com.xworkz.tanu.entity.CrackerEntity;
import com.xworkz.tanu.repository.CrackerRepository;

@Service
public class CrackerServiceImpl implements CrackerService{
	
	@Autowired
	private CrackerRepository crackerRepo;

	@Override
	public boolean save(CrackerDto crackerDto) {
		System.out.println("Running save method in serviceImpl...");
		CrackerEntity entity = new CrackerEntity();
		BeanUtils.copyProperties(crackerDto, entity);
		this.crackerRepo.save(entity);
		System.out.println("Entity saved " + entity);
		return true;
	}

	
//	@Override
//	public List<CrackerDto> findAll() {
//		System.out.println("Running find all method in service impl...");
//		List<CrackerEntity> entity = this.crackerRepo.findAll();
//		return null;
//	}

	
}
