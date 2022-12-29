package com.spring.project.collection;

public class Department {

	String dept_name;
	int dept_id;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String dept_name, int dept_id) {
		super();
		this.dept_name = dept_name;
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	@Override
	public String toString() {
		return "Department [dept_name=" + dept_name + ", dept_id=" + dept_id + "]";
	}

}
