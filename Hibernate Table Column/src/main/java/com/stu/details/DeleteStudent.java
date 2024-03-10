package com.stu.details;
import javax.persistence.*;
public class DeleteStudent {
 public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("uday");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Student s =em.find(Student.class, 7);
	
	et.begin();
	em.remove(s);
	et.commit();
	
}
}
