package com.xworkz.app.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.app.entity.TouristEntity;


@Repository
public class TouristRepoImpl implements  TouristRepo {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	
	public TouristRepoImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	
	@Override
	public boolean save(TouristEntity entity) {
		System.out.println("Running save in Repository");
		
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();
		
		return false;
	}

	@Override
	public TouristEntity findById(int id) {
		System.out.println("Find by id repo impli " + id);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		TouristEntity fromDB = manager.find(TouristEntity.class, id);
		manager.close();
		return fromDB;
		
	}
}
