package com.Employee;

import java.util.List;

public interface Employee_Service {
	String createEmployee(Employee_Entity employee);
	List<Employee_Entity> readEmployee();
	boolean deleteEmployee(Long id);
	String updateEmployee(Long id , Employee_Entity employee);
	Employee_Entity readEmployeebyId(Long id);
}
