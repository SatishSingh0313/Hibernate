package com.stu.details;
import javax.persistence.*;
public class UpdateStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		Student s =em.find(Student.class, 6);
		s.setName("Shohan");
		s.setEmail("Shohan@gmail.com");
		s.setAddress("Mumbai");
		s.setPhno(5478154878l);
		s.setAge(14);
		
		et.begin();
		em.merge(s);
		et.commit();
	}
}
