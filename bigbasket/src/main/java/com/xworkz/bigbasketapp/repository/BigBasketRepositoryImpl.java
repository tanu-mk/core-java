package com.xworkz.bigbasketapp.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.bigbasketapp.entity.BigBasketEntity;


@Repository
public class BigBasketRepositoryImpl implements BigBasketRepository{
		
	
	@Autowired	
	private EntityManagerFactory entityManagerFactory;
	
		
		public BigBasketRepositoryImpl() {
			System.out.println("Created " + this.getClass().getSimpleName());
		}


		@Override
		public boolean save(BigBasketEntity entity) {
			
			System.out.println("Running save in Repository");
			
			EntityManager em = this.entityManagerFactory.createEntityManager();
			 EntityTransaction et = em.getTransaction();
			 et.begin();
			 em.persist(entity);
			 et.commit();
			 em.close();
			 
			return false;
		}
		
		

		
		
}
