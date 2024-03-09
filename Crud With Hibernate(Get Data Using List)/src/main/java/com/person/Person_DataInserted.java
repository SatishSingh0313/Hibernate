package com.person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Person_DataInserted {  //Inserted Data
		
	public static void main(String[] args) {

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("satish");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = new Person();
		p.setId(103);
		p.setName("Rp");
		p.setEmail("Rp@gmail.com");
				
		et.begin();
		em.persist(p);
		et.commit();
		
	}

}
