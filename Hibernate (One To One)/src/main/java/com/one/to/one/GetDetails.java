package com.one.to.one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class GetDetails {
public static void main(String[] args) {
	
	EntityManagerFactory emf =Persistence.createEntityManagerFactory("satish");
	EntityManager em = emf.createEntityManager();
	
	Person p  = em.find(Person.class,2);
	Aadhaar a = em.find(Aadhaar.class, 102);
	
	if(true) {
		
		System.out.println("Id: "+p.getId());
		System.out.println("Name: "+p.getName());
		System.out.println("Phno: "+p.getPhno());
		
		System.out.println("--------------------------");
		
		System.out.println("AdharId: "+a.getAdharId());
		System.out.println("Address: "+a.getAddress());
		System.out.println("PinCode: "+a.getPincode());		
		
	}
  }
}
