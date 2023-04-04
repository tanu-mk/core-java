package com.xworkz.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.app.entity.SignUpEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class SignUpRepositoryImpl implements SignUpRepository {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	
	public SignUpRepositoryImpl() {
		log.info("Created " + this.getClass().getSimpleName());
	}
	
	
	
	@Override
	public boolean save(SignUpEntity entity) {
			log.info("Running save in Repository");
			log.info("Entity in Repo"+ entity);
			
			EntityManager em = this.entityManagerFactory.createEntityManager();
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.persist(entity);
			et.commit();
			em.close();
			
			return false;
		}
			
	
	public Long findByUser(String user) {
		
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNamedQuery("userId");
			query.setParameter("userBy", user);
			Object object = query.getSingleResult();
			Long value = (Long)object;
			System.out.println(value);
			return value;
		}
		finally {
			em.close(); 
		}
		
	}
	
	
	@Override
	public Long findByEmail(String email) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNamedQuery("emailId");
			query.setParameter("emailBy", email);
			Object object = query.getSingleResult();
			Long value = (Long) object;
			System.out.println(value);
			return value;

		} finally {
			em.close();
		}

	}

	
	@Override
	public Long findByMobile(Long number) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNamedQuery("mobileId");
			query.setParameter("mobileBy", number);
			Object object = query.getSingleResult();
			Long value = (Long) object;
			System.out.println(value);
			return value;

		} finally {
			em.close();
		}
	}
//	@Override
//	public SignUpEntity findByIdAndPassword(String userId, String password) {
//		EntityManager em = this.entityManagerFactory.createEntityManager();
//		try {
//			Query query = em.createNamedQuery("IdandPassword");
//			query.setParameter("u", userId);
//			query.setParameter("p", password);
//			Object object = query.getSingleResult();
//			SignUpEntity entity = (SignUpEntity) object;
//			log.info("" + entity);
//			return entity;
//		} finally {
//			em.close();
//		}
//
//	}
//	
	
	
	@Override
	public SignUpEntity findByIdAndPassword(String userId) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNamedQuery("IdandPassword");
			query.setParameter("u", userId);
			Object object = query.getSingleResult();
			SignUpEntity entity = (SignUpEntity) object;
			log.info("" + entity);
			return entity;
		} finally {
			em.close();
		}

	}
	
	
	
	
	
	
	
	
	@Override
	public Long findCountByEmailAndUserAndMobile(String email, String userId, long mobile) {
		
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		
		Query query = manager.createNamedQuery("findByCount");
		query.setParameter("e", email);
		query.setParameter("u", userId);
		query.setParameter("m", mobile);
		Object object = query.getSingleResult();
		Long count = (Long)object;
		System.err.println(count);
		
		return count;
	}

}
			
			
			
			
			
			
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	


