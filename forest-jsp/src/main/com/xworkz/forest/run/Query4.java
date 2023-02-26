package com.xworkz.forest.run;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Query4 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.forest");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findAreaByName");
		Object object = query.getSingleResult();
		Double entity = (Double)object;
		System.out.println(entity);
		manager.close();
		
	}

}
