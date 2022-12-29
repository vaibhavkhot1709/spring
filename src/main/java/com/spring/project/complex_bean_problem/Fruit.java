package com.spring.project.complex_bean_problem;

public class Fruit {
	int frt_id;
	String frt_name;
	double frt_price;
	
	

	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fruit(int frt_id, String frt_name, double frt_price) {
		super();
		this.frt_id = frt_id;
		this.frt_name = frt_name;
		this.frt_price = frt_price;
	}

	public int getFrt_id() {
		return frt_id;
	}

	public void setFrt_id(int frt_id) {
		this.frt_id = frt_id;
	}

	public String getFrt_name() {
		return frt_name;
	}

	public void setFrt_name(String frt_name) {
		this.frt_name = frt_name;
	}

	public double getFrt_price() {
		return frt_price;
	}

	public void setFrt_price(double frt_price) {
		this.frt_price = frt_price;
	}

	@Override
	public String toString() {
		return "Fruit [frt_id=" + frt_id + ", frt_name=" + frt_name + ", frt_price=" + frt_price + "]";
	}

}
