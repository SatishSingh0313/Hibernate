package com.watch.maven;
import java.util.List;

import javax.persistence.*;
public class GetData {
public static void main(String[] args) {  //Get Data
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("satish");
	 EntityManager em = emf.createEntityManager();

	 
	 Query q = em.createQuery("Select w From Watch w");
	 List<Watch> l = q.getResultList();
	 for(Watch w:l) {
		 System.out.println("Id:"+w.getId());
		 System.out.println("Brand:"+w.getBrand());
		 System.out.println("Cost:"+w.getCost());
		 System.out.println("-------------------------------");
	 }
	 
	 //Or
	 
	 Watch w =em.find(Watch.class, 1);
	 if(true) {
		 System.out.println("ID: "+w.getId());
		 System.out.println("BRAND: "+w.getBrand());
		 System.out.println("COST: "+w.getCost());
       }
 }
	 
}

