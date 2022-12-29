package com.spring.project.ConstructorDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorDI {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("constructordi.xml");
		Person p1 = ctx.getBean("person", Person.class);

		System.out.println(p1);
	}

}
