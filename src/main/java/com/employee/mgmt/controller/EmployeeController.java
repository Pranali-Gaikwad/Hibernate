package com.employee.mgmt.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.employee.mgmt.dto.Employee;
import com.employee.mgmt.service.EmployeeService;
import com.employee.mgmt.service.IEmployeeService;
@RestController
public class EmployeeController {


//	@Autowired
//	IEmployeeService empServiceRef;
	
	@Autowired
	IEmployeeService empServiceRef;
	
	@RequestMapping("/welcome")
	public String mth()
	{
		return "Pranali Gaikwad";
	}
	
	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		return  empServiceRef.getAllEmployee();
	}
	
	
	
	@RequestMapping("/employees/{Id}")
	public Employee getEmployeeById(@PathVariable int Id)
	{
		return empServiceRef.getEmployeeById(Id);
	}
	
	
	
	@RequestMapping(method=RequestMethod.POST, value="/employees")
	public void addEmployee(@RequestBody Employee employee)
	{
		empServiceRef.addEmployee(employee);
	}
	
	
	
	@RequestMapping(method=RequestMethod.PUT, value="/employees/{Id}")
	public void updateEmployee(@RequestBody Employee employee, @PathVariable int Id)
	{
		empServiceRef.updateEmployee(employee, Id);
	}
	
	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/employees/{Id}")
	public void deleteEmployee(@PathVariable int Id)
	{
		empServiceRef.deleteEmployee(Id);
	}
}
