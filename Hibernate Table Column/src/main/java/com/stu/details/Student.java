package com.stu.details;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="Hibernate_Student_Table")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private	int	id;
	@Column(unique=false)
private	String	name;
	@Column(nullable=false)
private	String	email;
	@Column(nullable=true)
private	long	phno;
	@Column(nullable=false)
private	String	address;
	
private	int	age;
  
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}
