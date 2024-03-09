package com.sangam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetLaptopDetails {
 public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("satish");
	EntityManager em = emf.createEntityManager();
	
	Laptop l= em.find(Laptop.class, 5);
	
	if(true) {
		System.out.println("Id: "+l.GetId());
		System.out.println("Brand: "+l.GetBrand());
		System.out.println("Color: "+l.GetCost());
		System.out.println("Price: "+l.GetColor());
	}
	else {
		System.out.println("No Data Found");
	}
	
	
}
}
