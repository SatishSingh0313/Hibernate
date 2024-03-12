package com.many.to.many;

import java.sql.ResultSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetData {
 public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("satish");
	EntityManager em = emf.createEntityManager();
	
	EMP emp = em.find(EMP.class, 2);
	System.out.println("EMP Id: "+emp.getEmpId());
	System.out.println("EMP Name: "+emp.getName());
	
	System.out.println("-------------------------------");
	
	Project p = em.find(Project.class,2);
	System.out.println("Project Id: "+p.getProjectId());
	System.out.println("Project Name: "+p.getProjectName());
  }
}
