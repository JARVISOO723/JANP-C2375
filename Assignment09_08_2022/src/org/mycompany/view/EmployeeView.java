package org.mycompany.view;

import org.mycompany.model.Employee;
import org.mycompany.service.EmployeeService;

public class EmployeeView {
	public static void main(String args[]) {
	Employee employee = new Employee(1, 'A', 10000);
	EmployeeService employeeservice = new EmployeeService();
	Employee updateEmployee = employeeservice.calaulateSalaryIncrement(employee);
	System.out.println("Employee Id : " + updateEmployee.getemployeeId());
	System.out.println("Employee Initial : " + updateEmployee.getemployeeInitial());
	System.out.println("Updated Salary : " + updateEmployee.getemployeeSalary());
	
 }
}