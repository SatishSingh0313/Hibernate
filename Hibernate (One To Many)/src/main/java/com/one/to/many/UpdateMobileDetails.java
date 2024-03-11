package com.one.to.many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class UpdateMobileDetails {
 public static void main(String[] args) {
	 
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("satish");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et= em.getTransaction();
	
	Sim s1 =em.find(Sim.class,104);
	
	s1.setNetwork("5G");
	s1.setServiceProvider("IDEA");
	
	List<Sim> sim = new ArrayList<Sim>();
	sim.add(s1);
	
	Mobile m = em.find(Mobile.class, 2);
	
	m.setBrand("Max");
	m.setCost(5200);
	m.setSim(sim);
	
	et.begin();
	em.merge(s1);
	em.merge(m);
	et.commit();
	
   }
}
