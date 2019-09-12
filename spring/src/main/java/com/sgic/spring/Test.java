package com.sgic.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main (String [] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Employee employee = (Employee)ctx.getBean("employeebean");
		
		System.out.println("Your id is: " + employee.getId());
		System.out.println("Your name is: " + employee.getName());
	}
}
