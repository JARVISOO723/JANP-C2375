package org.mycompany.model;

public class Employee {

	public int employeeId;
	public char employeeInitial;
	public int employeeSalary;
	public Employee() {
		
	}
	public Employee(int employeeId,char employeeInitial,int employeeSalary){
		
		this.employeeId=employeeId;  
		this.employeeInitial=employeeInitial;
		this.employeeSalary=employeeSalary;
		
	}
	
	public int getemployeeId(){
		return employeeId;
	}
	
	public void setemployeeId(int employeeId) {
		this.employeeId=employeeId;				
	}
	
	public char getemployeeInitial() {
		return employeeInitial;
	}
	
	public void setemployeeInitial(char employeeInitial) {
		this.employeeInitial=employeeInitial;
	}
	
	public int getemployeeSalary() {
		return employeeSalary;
	}
	
	public void setemployeeSalary(int employeeSalary){
		this.employeeSalary=employeeSalary;
	}

}
