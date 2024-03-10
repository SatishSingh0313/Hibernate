package com.stu.details;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
public static void main(String[] args) {
	EntityManagerFactory emf =Persistence.createEntityManagerFactory("uday");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Student s  = new Student();
	s.setName("Hari");
	s.setEmail("Hari@gmail.com");
	s.setPhno(7845895614l);
	s.setAddress("Kolkata");
	s.setAge(35);
	
	et.begin();
	em.persist(s);
	et.commit();
	}
}
