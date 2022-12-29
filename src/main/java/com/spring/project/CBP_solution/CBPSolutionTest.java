package com.spring.project.CBP_solution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CBPSolutionTest {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("CBP_solution.xml");
		Car c1=ctx.getBean("Car",Car.class);
		
		Car c2=ctx.getBean("Car",Car.class);
	
		System.out.println(c1==c2);
		
		System.out.println(c1.engine==c2.engine);
		
		
		
		
	}

}
