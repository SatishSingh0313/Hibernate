package com.watch.maven;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert_Watch {
public static void main(String[] args) {
	
	EntityManagerFactory emf =Persistence.createEntityManagerFactory("satish");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	Watch w = new Watch();   //Insert Data
	
	w.setBrand("Boat Watch");
	w.setCost(1099);
	
	et.begin();
	em.persist(w);
	et.commit();
	

}
}
