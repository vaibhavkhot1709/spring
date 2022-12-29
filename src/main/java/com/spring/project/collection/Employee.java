package com.spring.project.collection;

import java.util.List;
import java.util.Set;

public class Employee {

	int id;
	String name;
	int age;
	List<Integer> mobile_no;
	Set<String> vehicles;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, int age, List<Integer> mobile_no, Set<String> vehicles) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.mobile_no = mobile_no;
		this.vehicles = vehicles;
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Integer> getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(List<Integer> mobile_no) {
		this.mobile_no = mobile_no;
	}
	public Set<String> getVehicles() {
		return vehicles;
	}
	public void setVehicles(Set<String> vehicles) {
		this.vehicles = vehicles;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", mobile_no=" + mobile_no + ", vehicles="
				+ vehicles + "]";
	}
	
	

}
