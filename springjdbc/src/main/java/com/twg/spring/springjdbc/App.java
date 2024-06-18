package com.twg.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.twg.spring.springjdbc.business.EmployeeBusiness;
import com.twg.spring.springjdbc.business.EmployeeBusinessImpl;
import com.twg.spring.springjdbc.dto.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
      //create spring container
    	ApplicationContext context= new ClassPathXmlApplicationContext("configmetadata.xml");
    	
    	EmployeeBusiness employeeBusiness =(EmployeeBusinessImpl)context.getBean("employeeBusiness");
    	
    	//Employee emp=new Employee("15","SriSrinivas",19);    	
    	//employeeBusiness.insertEmployee(emp);
    	
    	
    	
    	//employeeBusiness.printEmployeeHikes();
    	
    	Employee employee= null;
    	
    	 try {
			employee = employeeBusiness.getEmployeeById("2");
		} catch (Exception e) {
		
		}
    	
    	
    	if(employee!=null)
    		System.out.println(employee.toString());
    	else  
    	
    	  System.out.println("No Matching records found");
    	
    	
    }
}
