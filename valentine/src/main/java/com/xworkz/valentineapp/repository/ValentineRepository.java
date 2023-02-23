package com.xworkz.valentineapp.repository;

import com.xworkz.valentineapp.entity.ValentineEntity;

public interface ValentineRepository {
	
	boolean save(ValentineEntity entity);
	
	default ValentineEntity findById(int id) {
		System.out.println("Running findById in repo...");
		return null;
	}

}
