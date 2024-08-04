package com.Employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee_Controller {

	@GetMapping("employees")
	public List<Employee_Entity> getEmployees(){
		List<Employee_Entity> employees = new ArrayList<>();
		return employees;
	}
	
}
