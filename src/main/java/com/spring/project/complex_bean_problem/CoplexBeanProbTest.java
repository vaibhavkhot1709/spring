package com.spring.project.complex_bean_problem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoplexBeanProbTest {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("complex_bean_problem.xml");
		
		Garden g1=ctx.getBean("garden", Garden.class);

		Garden g2=ctx.getBean("garden", Garden.class);
		
		System.out.println(g1==g2);
		
		System.out.println(g1.flower==g2.flower);
		System.out.println(g1.fruit==g2.fruit);
		
		
		
		
	}

}
