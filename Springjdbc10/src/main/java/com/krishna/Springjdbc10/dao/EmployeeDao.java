package com.krishna.Springjdbc10.dao;

import java.util.List;

import com.krishna.Springjdbc10.dto.Employee;

public interface EmployeeDao {
	
	public void insertEmployee(Employee employee);
	
	List<Employee> findAllEmployees();
	
	Employee getEmployeeById(String id);

}
