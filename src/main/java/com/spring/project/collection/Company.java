package com.spring.project.collection;

public class Company {

	String name;
	Employee employee;
	Department  department;
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(String name, Employee employee, Department department) {
		super();
		this.name = name;
		this.employee = employee;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", employee=" + employee + ", department=" + department + "]";
	}
	
		
}
