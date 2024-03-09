package com.sangam;

import javax.persistence.Entity;

@Entity
public class Laptop {
	@javax.persistence.Id
private int Id;
private String Brand;
private double Cost;
private String Color;

public void SetId(int Id) {
	this.Id=Id;
	}
public void SetBrand(String Brand) {
	this.Brand=Brand;
}
public void SetCost(double Cost) {
	this.Cost=Cost;
}
public void SetColor(String Color) {
	this.Color=Color;
}

public int GetId() {
	return Id;
}
public String GetBrand() {
	return Brand;
}
public double GetCost() {
	return Cost;
}
public String GetColor() {
	return Color;
}
}
