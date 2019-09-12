package com.sgic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sgic.dto.Employee;
@Controller
public class ListController {
	@RequestMapping("/readList")
	public ModelAndView sendObject() {
		ModelAndView modalandview = new ModelAndView();
		modalandview.setViewName("displayEmployeeList");
		
		List<Employee> employees = new ArrayList<Employee>();
		
		
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("sri ram");
		emp1.setSalary("100000");
		
		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("vimal");
		emp2.setSalary("100050");
		
		Employee emp3 = new Employee();
		emp3.setId(3);
		emp3.setName("rahu");
		emp3.setSalary("125000");
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		
		modalandview.addObject("employee",employees);
		
		return modalandview;
	}
}
