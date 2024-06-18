package com.krishna.Springjdbc10.business;

import com.krishna.Springjdbc10.dto.Employee;

public interface EmployeeBusiness {
	


	void printEmployeeHikes();
	
	 void insertEmployee(Employee employee);
	 
	 Employee getEmployeeById(String id);

}
