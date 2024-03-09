package com.person;
import java.util.List;

import javax.persistence.*;
public class GetDataUsingList {
public static void main(String[] args) {  //Get Data Using List
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("satish");
	EntityManager em = emf.createEntityManager();
	
	Query q = em.createQuery("Select p from Person  p");
	List<Person> l = q.getResultList();
	
	for(Person p1:l) {
		System.out.println("Id:"+p1.getId());
		System.out.println("Name:"+p1.getName());
		System.out.println("Email:"+p1.getEmail());
		System.out.println("----------------------");
	}
}
}
