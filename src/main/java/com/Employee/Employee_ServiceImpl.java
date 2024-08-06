package com.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Employee_ServiceImpl implements Employee_Service {
    
    @Autowired
    private Employee_repository erepo;

    @Override
    public String createEmployee(Employee_Entity employee) {
        erepo.save(employee);
        return "Saved Successfully";
    }

    @Override
    public List<Employee_Entity> readEmployee() {
        return erepo.findAll();
    }

    @Override
    public boolean deleteEmployee(Long id) {
        // Find the employee by id
        Employee_Entity employee = erepo.findById(id).orElse(null);
           erepo.delete(employee);
            return true;
        }
     

	@Override
	public String updateEmployee(Long id, Employee_Entity employee) {
		Employee_Entity existingemployee = erepo.findById(id).get();
		existingemployee.setName(employee.getName());
		existingemployee.setPhone(employee.getPhone());
		existingemployee.setEmail(employee.getEmail());
		erepo.save(existingemployee);
		return "Update Successfull";
	}

	@Override
	public Employee_Entity readEmployeebyId(Long id) {
		Employee_Entity existingemployee = erepo.findById(id).get();
		return existingemployee;
	}
}
