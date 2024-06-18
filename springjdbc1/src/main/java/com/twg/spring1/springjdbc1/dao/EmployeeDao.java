package com.twg.spring1.springjdbc1.dao;

import java.util.List;

import com.twg.spring1.springjdbc1.dto.Employee;

public interface EmployeeDao {

	  public void insertEmployee(Employee employee);
	  
	  List<Employee> findAllEmployees();
	  
	  Employee getEmployeeById(String id);
	
	
}
