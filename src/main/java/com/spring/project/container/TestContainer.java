package com.spring.project.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("container.xml");
		
		Student s1=ctx.getBean("student", Student.class);
		System.out.println(s1);
		
	}
}
