package com.sangam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateLaptop {		//Update	Data
	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("satish");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Laptop l = new Laptop();
		l.SetId(1);
		l.SetBrand("Apple");
		l.SetCost(49999.999);
		l.SetColor("Green");
		
		et.begin();
		em.merge(l);
		et.commit();
}
}
