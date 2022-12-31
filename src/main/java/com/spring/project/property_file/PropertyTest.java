package com.spring.project.property_file;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("propertyclassxml.xml");
		PropertyClass p1 = ctx.getBean("prop", PropertyClass.class);
		System.out.println(p1);

		Properties myProp = ctx.getBean("myConfiguration", Properties.class);

		System.out.println(myProp);
	}

}
