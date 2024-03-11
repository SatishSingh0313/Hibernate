package com.one.to.one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class UpdateDetails {
public static void main(String[] args) {
	
	EntityManagerFactory emf =Persistence.createEntityManagerFactory("satish");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Person p  =em.find(Person.class, 1);
	p.setName("Satish");
	p.setPhno(4588421584l);
	et.begin();
	em.merge(p);
	et.commit();
}
}
