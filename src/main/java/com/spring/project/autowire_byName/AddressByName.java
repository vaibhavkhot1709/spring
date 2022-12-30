package com.spring.project.autowire_byName;

public class AddressByName {
	
	int pin;
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "AddressByName [pin=" + pin + ", name=" + name + "]";
	}
	
	

}
