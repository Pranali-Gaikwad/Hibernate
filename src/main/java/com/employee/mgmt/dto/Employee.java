package com.employee.mgmt.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Employee
{
	@javax.persistence.Id
	@GeneratedValue
	private int Id;
	private String name;
	private String department;
	
	public Employee()
	{
		
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", department=" + department + "]";
	}



	public Employee(int id, String name, String department) {
		super();
		Id = id;
		this.name = name;
		this.department = department;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

}
