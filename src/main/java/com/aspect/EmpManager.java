package com.aspect;

import org.springframework.stereotype.Component;

@Component
public class EmpManager {

	public Employee getEmpDetails() {

		System.out.println("getEmpDetails() of EmpManager class get invoked");

		return new Employee(11, "Shree");
	}
}
