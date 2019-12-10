package com.employee.mgmt.service;

import java.util.List;

import com.employee.mgmt.dto.Employee;

public interface IEmployeeService {

	List<Employee> getAllEmployee();
	
	Employee getEmployeeById(int Id);

	void addEmployee(Employee employee);

	void updateEmployee(Employee employee, int Id);

	void deleteEmployee(int Id);

	

}
