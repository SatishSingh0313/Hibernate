package com.many.to.many;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteMobileDetails {
 public static void main(String[] args) {
	 
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("satish");
	EntityManager     em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Sim s1 = em.find(Sim.class,104);
	
	Mobile m1 = em.find(Mobile.class, 2);
	
	et.begin();
	em.remove(s1);
	em.remove(m1);
	et.commit();
			
 }
}
