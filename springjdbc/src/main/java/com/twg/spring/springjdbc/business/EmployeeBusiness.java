package com.twg.spring.springjdbc.business;

import com.twg.spring.springjdbc.dto.Employee;

public interface EmployeeBusiness {
	
	void printEmployeeHikes();
	
	 void insertEmployee(Employee employee);
	 
	 Employee getEmployeeById(String id);

}
