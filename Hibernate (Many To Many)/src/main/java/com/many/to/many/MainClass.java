package com.many.to.many;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		
		 	EntityManagerFactory emf =Persistence.createEntityManagerFactory("satish");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			
			EMP e1 = new EMP();
			e1.setName("DK");
			
			EMP e2 = new EMP();
			e2.setName("Hardik");
			
			Project p1 =new Project();
			p1.setProjectName("Developing");
			
			Project p2 =new Project();
			p2.setProjectName("Testing");
			
			e1.getProject().add(p1);
			e1.getProject().add(p2);
			e2.getProject().add(p2);
	
			et.begin();
			em.persist(e1);
			em.persist(e2);
			em.persist(p1);
			em.persist(p2);
			et.commit();
	}
}
