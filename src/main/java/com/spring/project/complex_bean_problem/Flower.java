package com.spring.project.complex_bean_problem;

public class Flower {
	
	int flr_id;
	String flr_name;
	double flr_price;
	
	
	public Flower() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flower(int flr_id, String flr_name, double flr_price) {
		super();
		this.flr_id = flr_id;
		this.flr_name = flr_name;
		this.flr_price = flr_price;
	}
	public int getFlr_id() {
		return flr_id;
	}
	public void setFlr_id(int flr_id) {
		this.flr_id = flr_id;
	}
	public String getFlr_name() {
		return flr_name;
	}
	public void setFlr_name(String flr_name) {
		this.flr_name = flr_name;
	}
	public double getFlr_price() {
		return flr_price;
	}
	public void setFlr_price(double flr_price) {
		this.flr_price = flr_price;
	}
	
	

}
