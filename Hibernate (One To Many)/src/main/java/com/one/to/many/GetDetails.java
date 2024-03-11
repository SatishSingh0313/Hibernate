package com.one.to.many;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("satish");
		EntityManager em = emf.createEntityManager();
		
		Mobile	m=em.find(Mobile.class, 1);
		Sim	s=em.find(Sim.class, 101);
		
		System.out.println("MobileId:->"+m.getMobileId());
		System.out.println("Brand:->"+m.getBrand());
		System.out.println("Cost:->"+m.getCost());
		
		
		System.out.println("SimId:->"+s.getSimId());
		System.out.println("Network:->"+s.getNetwork());
		System.out.println("ServiceProvider:->"+s.getServiceProvider());
		
		
}
}