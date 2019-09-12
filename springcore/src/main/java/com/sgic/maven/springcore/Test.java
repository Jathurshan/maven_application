package com.sgic.maven.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Employee employee = (Employee) ctx.getBean("emp");

		System.out.println("Employee Id :" + employee.getId());
		System.out.println("Employee Name :" + employee.getName());
	}

}
