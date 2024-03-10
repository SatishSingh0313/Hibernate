package com.watch.maven;
import javax.persistence.*;
public class DeleteWatch {
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("satish");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Watch w = em.find(Watch.class, 2);
		
		et.begin();
		em.remove(w);
		et.commit();
	}
}
