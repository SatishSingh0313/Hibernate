package com.watch.maven;
import javax.persistence.*;
public class UpdateWatch {
 public static void main(String[] args) {
	 
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("satish");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et= em.getTransaction();
	
	Watch w =  em.find(Watch.class, 1);
	w.setBrand("Apple Watch 6");
	w.setCost(7999);
	
	et.begin();
	em.merge(w);
	et.commit();
	
	}
}
