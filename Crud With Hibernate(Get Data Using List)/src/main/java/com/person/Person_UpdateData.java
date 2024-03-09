package com.person;
import javax.persistence.*;
public class Person_UpdateData {
public static void main(String[] args) { //Update Data
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("satish");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Person p = new Person();
	
	p.setId(4);
	p.setName("Satish");
	p.setEmail("Satish@gmail.com");
	
	et.begin();
	em.merge(p);
	et.commit();
}
}
