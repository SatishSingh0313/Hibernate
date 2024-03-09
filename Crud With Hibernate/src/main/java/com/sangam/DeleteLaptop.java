package com.sangam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteLaptop {
	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("satish");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
	
		Laptop l =em.find(Laptop.class, 2);
		
		et.begin();
		em.remove(l);
		et.commit();
}
}
