package org.mycompany.service;

import org.mycompany.model.Employee;

public class EmployeeService {

	public Employee calaulateSalaryIncrement(Employee employee) {
		employee.setemployeeSalary(employee.getemployeeSalary() +  employee.getemployeeSalary()*25/100);
		return employee;
	}
	
}