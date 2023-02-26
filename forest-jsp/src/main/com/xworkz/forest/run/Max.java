package com.xworkz.forest.run;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Max {
	
public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.forest");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findMaxArea");
		Object object = query.getSingleResult();
		 Double ref = (Double)object;
		 System.out.println(ref);
		 manager.close();
		
	}
	
	

}
