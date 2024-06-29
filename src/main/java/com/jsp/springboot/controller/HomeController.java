package com.jsp.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jsp.springboot.entity.Employee;
import com.jsp.springboot.service.EmployeeService;


@Controller
public class HomeController {
	
	@Autowired 
	private EmployeeService employeeService;
	@GetMapping("/")
	public String insertEmployee(Model model) {
		Employee employee=new Employee();
		employee.setName("Kishore");
		employee.setDesignation("Manager");
		employee.setDepartment("Accounts");
		employee.setExp(30);
		
		 Employee emp=employeeService.saveEmployee(employee);
		 
		 String msg="Employee "+emp.getName()+" with id "+emp.getId()+" is saved successfully";
		 
		 model.addAttribute("employee",emp);
		 model.addAttribute("message",msg);
		return "home";
	}
	

}
