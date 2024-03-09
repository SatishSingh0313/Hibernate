package com.sangam;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class LaptopDetails {	//Insert	Data
	
public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("satish");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Laptop l = new Laptop();
		l.SetId(4);
		l.SetBrand("HP");
		l.SetCost(30690.25);
		l.SetColor("Black");
		
		et.begin();
		em.persist(l);
		et.commit();
}
}
