package com.xworkz.chatsapp.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.chatsapp.entity.ChatsEntity;


@Repository 
public class ChatsRepositotyImpl implements ChatsRepository{

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	
	public ChatsRepositotyImpl() {
		System.out.println("Created "  +this.getClass().getSimpleName());
	}
	

	@Override
	public boolean save(ChatsEntity entity) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		 EntityTransaction et = em.getTransaction();
		 et.begin();
		 em.persist(entity);
		 et.commit();
		 em.close();
		
		 return false;
		}
	
	@Override
	public ChatsEntity findById(int id) {
		System.out.println("Find by id repo impli " + id);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		ChatsEntity fromDB = manager.find(ChatsEntity.class, id);
		manager.close();
		return fromDB;
		
	}

}
