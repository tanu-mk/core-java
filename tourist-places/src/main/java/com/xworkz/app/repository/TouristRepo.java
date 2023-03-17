package com.xworkz.app.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.app.controller.TouristController;
import com.xworkz.app.entity.TouristEntity;

import lombok.extern.slf4j.Slf4j;


public interface TouristRepo {
	
	boolean save(TouristEntity entity);
	
	boolean update(TouristEntity entity);
	
	boolean delete(int id);
	
	
	default TouristEntity findById(int id) {
		System.out.println("Running findById in repo...");
		return null;
	}
	
	default List<TouristEntity> findByDestination(String destination){
		return Collections.emptyList();
	}
	
	default List<TouristEntity> findByTwoProperties(){
		return Collections.emptyList();
	}
	
	default List<TouristEntity> findByAll(){
		return Collections.emptyList();
	}
	
	default List<TouristEntity> findByDestinationAndState(String destination, String state){
		return Collections.emptyList();
	}

}
