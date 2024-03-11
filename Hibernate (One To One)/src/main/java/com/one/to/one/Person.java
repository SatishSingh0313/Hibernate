package com.one.to.one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
   private int id;
   private String name;
   private long phno;
	  
	@OneToOne
    private Aadhaar adhar;
	  
	  
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public Aadhaar getAdhar() {
		return adhar;
	}

	public void setAdhar(Aadhaar adhar) {
		this.adhar = adhar;
	} 
}

