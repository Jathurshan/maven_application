package com.sgic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamsController {
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name")String Name, @RequestParam(value = "salary", required=false,defaultValue="600")Double salary) {
		
		System.out.println("ID " + id);
		System.out.println("Name "+Name);
		System.out.println("Salary "+salary);
		return new ModelAndView("userRegister");
	}
}
