package com.local.time;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
@SequenceGenerator(name="course_seq", initialValue = 101,allocationSize = 1)
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator="course_seq")
 private int id;
 private String name;
 private String emailId;
 private LocalDateTime localdatetime;
 
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
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public LocalDateTime getLocaldatetime() {
	return localdatetime;
}
public void setLocaldatetime(LocalDateTime localdatetime) {
	this.localdatetime = localdatetime;
}
}
