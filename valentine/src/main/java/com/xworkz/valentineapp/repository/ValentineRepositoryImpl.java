package com.xworkz.valentineapp.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.valentineapp.dto.ValentineDto;
import com.xworkz.valentineapp.entity.ValentineEntity;

@Repository
public class ValentineRepositoryImpl implements ValentineRepository {

	
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	
	public ValentineRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	

	@Override
	public boolean save(ValentineEntity entity) {
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
	public ValentineEntity findById(int id) {
		System.out.println("Find by id repo impli " + id);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		ValentineEntity fromDB = manager.find(ValentineEntity.class, id);
		manager.close();
		return fromDB;
		
	}
	
	
	
	
	

}
