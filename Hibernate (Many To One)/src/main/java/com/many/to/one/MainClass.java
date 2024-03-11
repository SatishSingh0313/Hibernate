package com.many.to.one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
  public static void main(String[] args) {
	  EntityManagerFactory emf =Persistence.createEntityManagerFactory("satish");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = new Person();
		
		 p.setPersonId(1);
		 p.setName("Dinga");
         p.setPhno(9874548845l);
         
         Bank b1 = new Bank();
         b1.setBankName("SBI");
         b1.setIfscCode("SBI0002154");
         b1.setAddress("Banglore");
         b1.setAccountNo(02154);
         b1.setPerson(p);
         
         Bank b2 = new Bank();
         b2.setBankName("ICICI");
         b2.setIfscCode("ICICI0002154");
         b2.setAddress("NDLS");
         b2.setAccountNo(00054);
         b2.setPerson(p);
         
         Bank b3 = new Bank();
         b3.setBankName("HDFC");
         b3.setIfscCode("HDFC0002154");
         b3.setAddress("BTM");
         b3.setAccountNo(045444);
         b3.setPerson(p);
		
         et.begin();
         em.persist(p);
         em.persist(b1);
         em.persist(b2);
         em.persist(b3);
         et.commit();
		
}
}
