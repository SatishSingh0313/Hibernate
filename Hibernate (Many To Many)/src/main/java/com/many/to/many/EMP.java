package com.many.to.many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class EMP {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	
	
	private String name;
	
	 @ManyToMany(cascade = CascadeType.ALL)
	    @JoinTable(
	        name = "emp_project",
	        joinColumns = @JoinColumn(name = "emp_id"),
	        inverseJoinColumns = @JoinColumn(name = "project_id")
	    )
	private List<Project> project=new ArrayList<Project>();

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	public EMP() {
		super();
	}	
} 
