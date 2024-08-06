
package com.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class Employee_Controller {

    @Autowired
    private Employee_Service employeeService;

    @PostMapping
    public String createEmployee(@RequestBody Employee_Entity employee) {
         employeeService.createEmployee(employee);
            return employeeService.createEmployee(employee);
    }

    @GetMapping
    public List<Employee_Entity> getEmployees() {
        return employeeService.readEmployee();
    }
    
    @GetMapping("/id")
    public List<Employee_Entity> getEmployeesbyId(@PathVariable Long id) {
        return employeeService.readEmployee();
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
      if(employeeService.deleteEmployee(id)) {
    	  return "Deleted Successfully";
      }
         return "Not Found";
    }
    
    @PutMapping("/{id}")
    public String updateEmployee(@PathVariable Long id , @RequestBody Employee_Entity employee) {
    	return employeeService.updateEmployee(id, employee);
    }
}

