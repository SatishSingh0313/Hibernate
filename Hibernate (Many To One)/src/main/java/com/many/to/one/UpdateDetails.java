package com.many.to.one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateDetails {
public static void main(String[] args) {
	EntityManagerFactory emf =Persistence.createEntityManagerFactory("satish");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Bank b  =em.find(Bank.class, 1);
	b.setAddress("Bengluru");
	
	et.begin();
	em.merge(b);
	et.commit();
	
}
}
