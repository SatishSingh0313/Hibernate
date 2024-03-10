package com.local.time;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteCourse {
public static void main(String[] args) {
	EntityManagerFactory emf =Persistence.createEntityManagerFactory("uday");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	et.begin();
	em.createQuery("Delete From Course").executeUpdate();
	et.commit();
	System.out.println("Delete Successfully");
	}
}
