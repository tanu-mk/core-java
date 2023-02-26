package main.java.com.xworkz.festivalapp.run;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import main.java.com.xworkz.festivalapp.entity.FestivalEntity;

public class FestivalRunner {
	
	public static void main(String[] args) {
		
		System.out.println("Running in Persistence Runner");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.festival");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		FestivalEntity entity1 = new FestivalEntity("Ugadi", "Hindu", "Holige", "Shiva", 1 );
		FestivalEntity entity2 = new FestivalEntity("AkshayaTritiya", "Hindu", "Payasa", "Basavanna", 1 );
		FestivalEntity entity3 = new FestivalEntity("RamaNavami", "Hindu", "Panaka", "Rama", 1 );
		FestivalEntity entity4 = new FestivalEntity("Hanuman Jayanthi", "Hindu", "Ladoo", "Hanuman", 1 );
		FestivalEntity entity5 = new FestivalEntity("Gurupoornima", "Hindu", "Kesri Bath", "Guru", 1 );
		FestivalEntity entity6 = new FestivalEntity("NagarPanchami", "Hindu", "Sajige", "Nagappa", 1 );
		FestivalEntity entity7 = new FestivalEntity("Krishna Janmastami", "Hindu", "Mysore Pak", "Krishna", 1 );
		FestivalEntity entity8 = new FestivalEntity("Ganesh Chaturthi", "Hindu", "Modak", "Ganeshna", 1 );
		FestivalEntity entity9 = new FestivalEntity("Deepavali", "Hindu", "Shayige", "Lakshmi", 1 );
		FestivalEntity entity10 = new FestivalEntity("Ekadashi", "Hindu", "peda", "Tirupathi", 1 );
		FestivalEntity entity11 = new FestivalEntity("Sankranthi", "Hindu", "Yelu Bella", "Ayappa", 1 );
		FestivalEntity entity12 = new FestivalEntity("Ramzan", "Muslim", "Biryani", "Allah", 1 );
		FestivalEntity entity13 = new FestivalEntity("Christmas", "Christian", "Cake", "Jesus", 1 );
		FestivalEntity entity14 = new FestivalEntity("Gowri Pooja", "Hindu", "Payasa", "Gowri", 1 );
		FestivalEntity entity15 = new FestivalEntity("Holi", "Hindu", "Huggi", "Kamanna", 1 );
		FestivalEntity entity16 = new FestivalEntity("RakshaBandan", "Hindu", "Peda", "Rave Ladoo", 1 );
		FestivalEntity entity17 = new FestivalEntity("Kara Hunnime", "Hindu", "Huggi", "Basava", 1 );
		FestivalEntity entity18 = new FestivalEntity("MahaNavami", "Hindu", "Sabu Payasa", "Bhavani", 9 );
		FestivalEntity entity19 = new FestivalEntity("Dusserha", "Hindu", "Payasa", "Chamundeshwari", 9 );
		FestivalEntity entity20 = new FestivalEntity("Varamahalakshmi", "Hindu", "Godhi Payasa", "Lakshmi", 1 );
		FestivalEntity entity21 = new FestivalEntity("Ayudha Pooja", "Hindu", "Holige", "Ayudha", 1 );
		FestivalEntity entity22 = new FestivalEntity("Good Friday", "Christian", "Plum Cake", "Jesus", 1 );
		FestivalEntity entity23 = new FestivalEntity("Bakrid", "Muslim", "Biryani", "Allah", 1 );
		FestivalEntity entity24 = new FestivalEntity("New Year", "World", "Cake", "All God", 1 );
		FestivalEntity entity25 = new FestivalEntity("Basava Jyanathi", "Hindu", "Holige", "Basavanna", 1 );
		
		
		manager.persist(entity25);
		manager.persist(entity24);
		manager.persist(entity23);
		manager.persist(entity22);
		manager.persist(entity21);
		manager.persist(entity20);
		manager.persist(entity19);
		manager.persist(entity18);
		manager.persist(entity17);
		manager.persist(entity16);
		manager.persist(entity15);
		manager.persist(entity14);
		manager.persist(entity13);
		manager.persist(entity12);
		manager.persist(entity11);
		manager.persist(entity10);
		manager.persist(entity9);
		manager.persist(entity8);
		manager.persist(entity7);
		manager.persist(entity6);
		manager.persist(entity5);
		manager.persist(entity4);
		manager.persist(entity3);
		manager.persist(entity2);
		manager.persist(entity1);
		transaction.commit();
		manager.close();
	}

}
