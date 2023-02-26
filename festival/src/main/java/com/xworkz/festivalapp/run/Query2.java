package main.java.com.xworkz.festivalapp.run;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import main.java.com.xworkz.festivalapp.entity.FestivalEntity;

public class Query2 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.festival");
		EntityManager manager = factory.createEntityManager();
		
		Query query1 = manager.createNamedQuery("findByNameAndRegionAndMainGod");
		query1.setParameter("n", "Hanuman Jayanthi" );
		query1.setParameter("r", "Hindu" );
		query1.setParameter("g", "Hanuman");
		Object object = query1.getSingleResult();
		FestivalEntity entity = (FestivalEntity)object;
		System.out.println(entity);
		
		System.out.println("====================================================");
		
		Query query2 = manager.createNamedQuery("findByMainGod");
		query2.setParameter("m", "Chamundeshwari" );
		Object object2 = query2.getSingleResult();
		FestivalEntity entity2 = (FestivalEntity)object2;
		System.out.println(entity2);
		
		System.out.println("====================================================");
		
		Query query3 = manager.createNamedQuery("findTotalDaysByName");
		query3.setParameter("tn", "Krishna Janmastami" );
		Object object3 = query3.getSingleResult();
		Integer ref = (Integer)object3;
		System.out.println(ref);
		
		System.out.println("====================================================");
		
		Query query4 = manager.createNamedQuery("findRegionAndMainGodByNameAndId");
		query4.setParameter("n", "Good Friday" );
		query4.setParameter("i", 4);
		Object object4 = query4.getSingleResult();
		Object[] array = (Object[])object4;
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		System.out.println("====================================================");
		
		Query query5 = manager.createNamedQuery("findMainGodAndTotalDaysByName");
		query5.setParameter("p", "MahaNavami" );
		Object object5 = query5.getSingleResult();
		Object[] array1 = (Object[])object5;
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		
		System.out.println("====================================================");
		
		Query query6 = manager.createNamedQuery("findTotal");
		Object object6 = query6.getSingleResult();
		long l = (long)object6;
		System.out.println(l);
		
		System.out.println("====================================================");
		
		Query query7 = manager.createNamedQuery("findMaxTotalDays");
		Object object7 = query7.getSingleResult();
		Integer x = (Integer)object7;
		System.out.println(x);
		
		
	}

}
