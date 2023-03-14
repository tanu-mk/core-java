package com.xworkz.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.app.entity.TouristEntity;


@Repository
public class TouristRepoImpl implements  TouristRepo {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	
	public TouristRepoImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	
	@Override
	public boolean save(TouristEntity entity) {
		System.out.println("Running save in Repository");
		
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();
		
		return false;
	}

	@Override
	public TouristEntity findById(int id) {
		System.out.println("Find by id repo impli " + id);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		TouristEntity fromDB = manager.find(TouristEntity.class, id);
		manager.close();
		return fromDB;
		
	}
	
	
	@Override
	public List<TouristEntity> findByDestination(String destination){
		
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		
		try {
			Query query = manager.createNamedQuery("findByDestination");
			query.setParameter("d", destination);
			List<TouristEntity> list = query.getResultList();
			System.out.println("Total list found in repo " + list.size());
			
			return list;
		}finally {
			manager.close();
		}
	}
	
	

	@Override
	public boolean update(TouristEntity entity) {
		System.out.println("Running save in Repository");
		
		EntityManager em = this.entityManagerFactory.createEntityManager();
		
		try {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(entity);
		et.commit();
		return true;
		}
		finally {
			em.close();
		}
		
	}


	@Override
	public boolean delete(int id) {
		
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			TouristEntity entity = manager.find(TouristEntity.class, id);
			manager.remove(entity);
			transaction.commit();
			return true;
		}finally {
			manager.close();
		}
	}
	
	
	@Override
	public List<TouristEntity> findByAll() {
		
     EntityManager manager = this.entityManagerFactory.createEntityManager();
		
		try {
			Query query = manager.createNamedQuery("list");
			List list = query.getResultList();
			list.forEach(t -> System.out.println(t));
			return list;
		}catch(PersistenceException e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
	return TouristRepo.super.findByAll();
	}
	
	
	@Override
	public List<TouristEntity> findByDestinationAndState(String destination, String state) {
		
		 EntityManager manager = this.entityManagerFactory.createEntityManager();
			
			try {
				Query query = manager.createNamedQuery("searchByTwoProperties");
				query.setParameter("d", destination);
				query.setParameter("s", state);
				List list = query.getResultList();
				list.forEach(t -> System.out.println(t));
				return list;
			}catch(PersistenceException e) {
				e.printStackTrace();
			}finally {
				manager.close();
			}
		return TouristRepo.super.findByDestinationAndState(destination, state);
		}
	}
	

