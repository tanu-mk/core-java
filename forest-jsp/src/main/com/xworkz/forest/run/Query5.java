package com.xworkz.forest.run;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Query5 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.forest");
		EntityManager manager = factory.createEntityManager();		
		Query query = manager.createNamedQuery("findNameById");
		Object object = query.getSingleResult();
		String entity = (String)object;
		System.out.println(entity);
		manager.close();
		
	}

}
