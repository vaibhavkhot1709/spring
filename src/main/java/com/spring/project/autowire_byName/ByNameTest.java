package com.spring.project.autowire_byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByNameTest {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("autowireByName.xml");
		
		ByName b1=ctx.getBean("byname",ByName.class);
		
		System.out.println(b1);
		
	}

}
