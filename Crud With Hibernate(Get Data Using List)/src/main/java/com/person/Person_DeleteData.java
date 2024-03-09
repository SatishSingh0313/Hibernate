package com.person;
import javax.persistence.*;

public class Person_DeleteData {
public static void main(String[] args) {  //Delete Data
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("satish");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Person p =em.find(Person.class, 4);
	
	et.begin();
	em.remove(p);
	et.commit();
}
}
