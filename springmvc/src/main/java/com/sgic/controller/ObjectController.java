package com.sgic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sgic.dto.Employee;
@Controller
public class ObjectController {
	@RequestMapping("/readObject")
	public ModelAndView sendObject() {
		ModelAndView modalandview = new ModelAndView();
		modalandview.setViewName("displayEmployee");
		
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("stark");
		emp.setSalary("100000");
		
		modalandview.addObject("employee",emp);
		
		return modalandview;
	}

}
