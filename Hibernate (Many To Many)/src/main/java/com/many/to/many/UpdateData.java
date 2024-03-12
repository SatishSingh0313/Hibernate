package com.many.to.many;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateData {
 public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("satish");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	EMP e1 =em.find(EMP.class, 2);
	 e1.setName("Satish");
	
	Project p1 = em.find(Project.class,2);
	p1.setProjectName("Java Developer");
	
	e1.getProject().add(p1);
	
	et.begin();
	em.merge(e1);
	em.merge(p1);
	et.commit();
	
	
   }
}
