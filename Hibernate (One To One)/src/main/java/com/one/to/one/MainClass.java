package com.one.to.one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
public static void main(String[] args) {
	
	EntityManagerFactory emf =Persistence.createEntityManagerFactory("satish");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	
	Aadhaar a = new Aadhaar();
	a.setAdharId(102);
	a.setAddress("Delhi");
	a.setPincode(201306);
	
	Person p = new Person();
	p.setId(2);
	p.setName("Dk");
	p.setPhno(4578421584l);
	p.setAdhar(a);
	
	
	et.begin();
	em.persist(p);
	em.persist(a);
	et.commit();
	
	
}
}
