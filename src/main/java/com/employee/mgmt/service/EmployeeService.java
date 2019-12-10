package com.employee.mgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.mgmt.dao.IEmployeeDao;
import com.employee.mgmt.dto.Employee;



@Service
public class EmployeeService implements IEmployeeService
{
	@Autowired
	private IEmployeeDao daoRef;
	
	
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return daoRef.findAll();
	}

	@Override
	public Employee getEmployeeById(int Id) {
		// TODO Auto-generated method stub
		return daoRef.getOne(Id);
		
		
		
		
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		daoRef.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee, int Id) {
		// TODO Auto-generated method stub
		daoRef.save(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		daoRef.delete(id);
	
	}
}