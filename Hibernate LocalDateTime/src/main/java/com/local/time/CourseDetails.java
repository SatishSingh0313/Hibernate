package com.local.time;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CourseDetails {
public static void main(String[] args) {
	EntityManagerFactory emf =Persistence.createEntityManagerFactory("uday");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Course c = new Course();
	c.setName("Ramesh");
	c.setEmailId("Ramesh@gmail.com");
	c.setLocaldatetime(LocalDateTime.now());
	System.out.println("Data Inserted");
	
	et.begin();
	em.persist(c);
	et.commit();
}
}
