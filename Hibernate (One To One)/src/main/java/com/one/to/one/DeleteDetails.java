package com.one.to.one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteDetails {
public static void main(String[] args) {
	
	EntityManagerFactory emf =Persistence.createEntityManagerFactory("satish");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Person p = em.find(Person.class, 1);
	Aadhaar a = em.find(Aadhaar.class, 101);
	
	et.begin();
	em.remove(p);
	em.remove(a);
	et.commit();
	
   	}
}
