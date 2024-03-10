package com.watch.maven;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Hibernate_Watch_Table")

public class Watch {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "WatchId")
private int id;
	@Column(name = "WatchBrand")
private String brand;
	@Column(name = "WatchCost")
private int cost;
	
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}

}
