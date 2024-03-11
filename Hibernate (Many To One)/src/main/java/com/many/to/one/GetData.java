package com.many.to.one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetData {
  public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("satish");
	EntityManager     em = emf.createEntityManager();
	
	Person p = em.find(Person.class, 1);
	Bank b =em.find(Bank.class,1);
	System.out.println("PersonId: "+p.getPersonId());
	System.out.println("Name: "+p.getName());
	System.out.println("PhoneNo: "+p.getPhno());
	
	System.out.println("BankId: "+b.getBankId());
	System.out.println("BankName: "+b.getBankName());
	System.out.println("AccountNo: "+b.getAccountNo());
	System.out.println("IfscCode: "+b.getIfscCode());
	System.out.println("Address: "+b.getAddress());
	
}
}
