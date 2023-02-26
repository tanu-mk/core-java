package com.xworkz.forest.run;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.forest.entity.ForestEntity;

public class Query3 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.forest");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByCountry");
		Object object = query.getSingleResult();
		ForestEntity fEntity = (ForestEntity)object;
		System.out.println(fEntity);
		manager.close();
		
		
		
		
		
	}

}
