package com.spring.project.autowire_byName;

public class ByName {
	
	int roll;
	String name;
	
	AddressByName addBN;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AddressByName getAddBN() {
		return addBN;
	}

	public void setAddBN(AddressByName addBN) {
		this.addBN = addBN;
	}

	@Override
	public String toString() {
		return "ByName [roll=" + roll + ", name=" + name + ", addBN=" + addBN + "]";
	}
	
	
	
	

}
