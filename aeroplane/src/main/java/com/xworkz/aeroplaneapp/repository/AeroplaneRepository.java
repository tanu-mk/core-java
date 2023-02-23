package com.xworkz.aeroplaneapp.repository;

import com.xworkz.aeroplaneapp.entity.AeroplaneEntity;

public interface AeroplaneRepository {
	
	boolean save(AeroplaneEntity entity);
	

	default AeroplaneEntity findById(int id) {
		System.out.println("Running findById in repo...");
		return null;
	}


}
