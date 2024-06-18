package com.twg.spring1.springjdbc1.business;

import java.util.List;

import com.twg.spring1.springjdbc1.dao.EmployeeDao;
import com.twg.spring1.springjdbc1.dto.Employee;

public class EmployeeBusinessImpl implements EmployeeBusiness {
	
	private EmployeeDao employeeDao;
	

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}


	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}


	public void printEmployeesHikes() {
		
		
		//ask dao for employee data
		
		List<Employee> employees=employeeDao.findAllEmployees();
		
		//check each employee and print hikes
		
		if(employees!=null)
		{
			for(Employee employee : employees)
			{
				if(employee.getExp()>=15)
				{
					System.out.println("Employee with id "+employee.getId()+" and name "+employee.getName()+" with experiance"+employee.getExp()+" got 30% hike");	
					
				}
				else if(employee.getExp()>=10)
				{
					
					System.out.println("Employee with id "+employee.getId()+" and name "+employee.getName()+" with experiance"+employee.getExp()+" got 25% hike");	
					
				}
				else if(employee.getExp()>=5)
				{
					
					System.out.println("Employee with id "+employee.getId()+" and name "+employee.getName()+" with experiance"+employee.getExp()+" got 20% hike");
				}
				else
				{
					System.out.println("Employee with id "+employee.getId()+" and name "+employee.getName()+" with experiance"+employee.getExp()+" got 15% hike");	
					
				}
			}
			
			
			
		}

	}

}
