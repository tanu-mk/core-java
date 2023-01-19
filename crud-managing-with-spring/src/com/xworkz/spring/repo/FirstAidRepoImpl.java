package com.xworkz.spring.repo;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.FirstAidDto;

@Component
public class FirstAidRepoImpl implements FirstAidRepo{

	@Override
	public boolean save(FirstAidDto dto) {
		
		return false;
	}

}
