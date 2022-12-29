package com.spring.project.ConstructorDI;

public class Person {
	
	int age;
	String name;
	Address adress;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int age, String name, Address adress) {
		super();
		this.age = age;
		this.name = name;
		this.adress = adress;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdress() {
		return adress;
	}
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", adress=" + adress + "]";
	}
	
	

}
