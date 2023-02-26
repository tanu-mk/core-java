package com.xworkz.forest.run;

import com.xworkz.forest.entity.ForestEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ForestRunner {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.forest");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		ForestEntity entity = new ForestEntity(10, "Talakaveri", "Moist Deciduous", 654.89, "India");
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		
		System.out.println(entity);
	}

}
