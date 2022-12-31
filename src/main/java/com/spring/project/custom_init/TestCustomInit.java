package com.spring.project.custom_init;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomInit {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("custominit.xml");
		Vehicle vehicle = ctx.getBean("custominit", Vehicle.class);

		System.out.println(vehicle);

		ctx.close();

	}

}
