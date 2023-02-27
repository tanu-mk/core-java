package com.xworkz.app.repository;

import com.xworkz.app.entity.TouristEntity;

public interface TouristRepo {
	
	boolean save(TouristEntity entity);
	

	default TouristEntity findById(int id) {
		System.out.println("Running findById in repo...");
		return null;
	}

}
