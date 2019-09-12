package com.sgic.maven.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ManageTest {
	public static void main(String [] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/sgic/maven/springcore/listconfig.xml");
		Hospital hospital = (Hospital)context.getBean("hospitalbean");
		System.out.println(hospital.getName());
		System.out.println(hospital.getDepartment());
		System.out.println(hospital.getDepartment().getClass());
	}

}
