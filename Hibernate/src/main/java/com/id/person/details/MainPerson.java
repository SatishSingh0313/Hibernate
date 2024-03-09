package com.id.person.details;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class MainPerson {
		
	public static void main(String[] args) {
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("satish");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person_Details p = new Person_Details();
		
		Scanner sc = new Scanner(System.in);
      	System.out.println("----Welcome To Hibernate-----");

		while(true) {
			System.out.println("1.Enter Id\n2.Enter name \n3.Enter email ");
		System.out.println("Enter Id");
		p.setId(sc.nextInt());
		System.out.println("Enter Name");
		p.setName(sc.next());
		System.out.println("Enter Email");
		p.setEmail(sc.next());
	
		et.begin();
		em.persist(p);
		et.commit();

	}

	}
	}
