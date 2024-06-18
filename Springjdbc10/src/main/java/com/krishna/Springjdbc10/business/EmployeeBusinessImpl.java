package com.krishna.Springjdbc10.business;

import java.util.List;

import com.krishna.Springjdbc10.dao.EmployeeDao;
import com.krishna.Springjdbc10.dto.Employee;

public class EmployeeBusinessImpl implements EmployeeBusiness {

	private EmployeeDao employeeDao;
	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao=employeeDao;
	}
	@Override
	public void printEmployeeHikes() {
		//ask Dao for employee data
		
		List<Employee> employees=employeeDao.findAllEmployees();
		
		//check each employee and print hike
		
		if(employees!=null) {
			for(Employee employee:employees) {
				 if(employee.getExp()>=15){
						System.out.println("Employee with id "+employee.getId()+" and name "+employee.getName()+" with experiance"+employee.getExp()+" got 30% hike");
				 }
				 else if(employee.getExp()>=10) {
						System.out.println("Employee with id "+employee.getId()+" and name "+employee.getName()+" with experiance"+employee.getExp()+" got 25% hike");
				 }
				 else if(employee.getExp()>=5) {
						System.out.println("Employee with id "+employee.getId()+" and name "+employee.getName()+" with experiance"+employee.getExp()+" got 20% hike");	

				 }
				 else {
						System.out.println("Employee with id "+employee.getId()+" and name "+employee.getName()+" with experiance"+employee.getExp()+" got 15% hike");
 
				 }
			}
		}
	}
	
	public void insertEmployee(Employee employee) {
		
		employeeDao.insertEmployee(employee);
	}
	public Employee getEmployeeById(String id) {
		
		return employeeDao.getEmployeeById(id);
 
	}

	

}
