package com.person;

import java.util.List;

import javax.persistence.*;

public class Person_GetData {  //Get Data
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("satish");
	EntityManager em=emf.createEntityManager();
	
	Person p = em.find(Person.class, 101);
	if(true) {
		System.out.println("Id: "+p.getId());
		System.out.println("Name: "+p.getName());
		System.out.println("Email: "+p.getEmail());
	}else {
		System.out.println("Data is not Persent");
	}
	System.out.println("=================================");
	
	
}
}
