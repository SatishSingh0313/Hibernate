package com.stu.details;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetStudent {
	public static void main(String[] args) {    //JPQL->Java	Persistence	Query	Language
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("Select s From Student s");
		List<Student>  l =q.getResultList();
		for(Student s:l) {
			
			System.out.println("Id:	"+s.getId());
			System.out.println("Name:	"+s.getName());
			System.out.println("Age:	"+s.getAge());
			System.out.println("Email:	"+s.getEmail());
			System.out.println("Phno:	"+s.getPhno());
			System.out.println("Address:"+s.getAddress());
			System.out.println("-----------------------------");
	}
		
}
}