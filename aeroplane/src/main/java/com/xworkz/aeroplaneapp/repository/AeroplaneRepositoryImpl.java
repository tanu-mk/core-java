package com.xworkz.aeroplaneapp.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.aeroplaneapp.entity.AeroplaneEntity;


@Repository
public class AeroplaneRepositoryImpl implements AeroplaneRepository  {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	
	public AeroplaneRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(AeroplaneEntity entity) {
		System.out.println("Running save.....");
		
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();

		return false;
	}
	

	@Override
	public AeroplaneEntity findById(int id) {
		System.out.println("Find by id repo impli " + id);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		AeroplaneEntity fromDB = manager.find(AeroplaneEntity.class, id);
		manager.close();
		return fromDB;
		
	}

}
