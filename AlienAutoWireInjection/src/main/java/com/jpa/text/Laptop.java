package com.jpa.text;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + "]";
	}
private int lid;
private String brand;
public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public void compile() {
	System.out.println("compiling");
}
}
