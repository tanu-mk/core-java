package main.java.com.xworkz.festivalapp.run;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import main.java.com.xworkz.festivalapp.entity.FestivalEntity;

public class FindByIdAndName {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.festival");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByIdAndName");
		query.setParameter("i", 17 );
		query.setParameter("n", "Deepavali");
		Object object = query.getSingleResult();
		FestivalEntity entity = (FestivalEntity)object;
		System.out.println(entity);
		
		
	}

}
