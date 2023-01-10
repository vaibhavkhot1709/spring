package com.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmpAOPTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(EmpConfig.class);
		ctx.refresh();

		EmpManager em1 = ctx.getBean(EmpManager.class);

		em1.getEmpDetails();

		System.out.println("main ends ");

	}

	@Before("execution(* EmpManager.getEmpDetails())")
	public void printSomething() {
		for(int i=0;i<4;i++) {
			System.out.println("value of i :"+i);
		}
//		System.out.println("hiii welcome");
	}
}
