package com.xworkz.tanu.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	

	
	@Override
	public CrackerEntity update(CrackerEntity crackerEntity) {
		System.out.println("Running update in service...");
		int id = crackerEntity.getId();
		CrackerEntity dto = crackerRepo.findById(id).get();
		dto.setName(crackerEntity.getName());
		dto.setPrice(crackerEntity.getPrice());
		dto.setBrand(crackerEntity.getBrand());
		return crackerRepo.save(dto);
		
	}
	
	
	@Override
	public void deleteById(int id) {
		System.out.println("Running delete in service...");
		this.crackerRepo.deleteById(id);
	}
	
	
	@Override
	public List<CrackerDto> findAll() {
		System.out.println("Running findAll...");
		List<CrackerEntity> list = (List<CrackerEntity>) this.crackerRepo.findAll();
		return list.stream().map(t -> new CrackerDto(t.getId(), t.getName(), t.getBrand(), t.getPrice()))
				.collect(Collectors.toList());
		
		
	}



	@Override
	public Page<CrackerEntity> Pagination(Pageable pageable) {
		System.out.println("Running Pagination in service...");
		return crackerRepo.findAll(pageable);
	}
	
	
	



	
	
	
	


	
}
