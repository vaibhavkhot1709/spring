package com.spring.project.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("collectioncontext.xml");
		
		Company company=ctx.getBean("company", Company.class);
		System.out.println(company);
		
	}

}
