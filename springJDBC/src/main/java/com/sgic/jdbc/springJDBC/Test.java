package com.sgic.jdbc.springJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
	public static void main(String [] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sgic/jdbc/springJDBC/config.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate)ctx.getBean("jdbcTemplate");
		String sql  = "INSERT INTO employee VALUES(?,?,?)";
		int result = jdbcTemplate.update(sql,new Integer(1),"stark", "tony" );
		System.out.println(result);
		
	}

}
