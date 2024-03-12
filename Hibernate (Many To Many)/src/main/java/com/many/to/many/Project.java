package com.many.to.many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int projectId;
	
	private String projectName;
	
	 @ManyToMany(mappedBy = "project")
	private List<EMP> emp = new ArrayList<EMP>();

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<EMP> getEmp() {
		return emp;
	}

	public void setEmp(List<EMP> emp) {
		this.emp = emp;
	}

	public Project() {
		super();
	}
	
	
}	
