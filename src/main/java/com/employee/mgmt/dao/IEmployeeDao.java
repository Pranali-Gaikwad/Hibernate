package com.employee.mgmt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.mgmt.dto.Employee;

@Repository
public interface IEmployeeDao extends JpaRepository<Employee, Integer> {


}
