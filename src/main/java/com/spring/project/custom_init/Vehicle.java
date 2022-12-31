package com.spring.project.custom_init;

public class Vehicle {

	int id;
	String type;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", type=" + type + "]";
	}

	public void initVehicle() {
		System.out.println("vehicle init invoked");
	}

	public void destroyMethod() {
		System.out.println("vehicle destroyed  invoked");

	}

}
