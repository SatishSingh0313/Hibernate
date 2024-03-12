package com.many.to.many;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteData {
	public static void main(String[] args) {  //error
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("satish");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
	
			EMP e1 = em.find(EMP.class, 2);	
			e1.getEmpId();
			Project p1 = em.find(Project.class,2);
			p1.getProjectId();
			
			et.begin();
			em.remove(e1);
			em.remove(p1);
			et.commit();	
	}
}
