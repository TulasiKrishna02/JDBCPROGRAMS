package com.krishna.Springjdbc10;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.krishna.Springjdbc10.business.EmployeeBusiness;
import com.krishna.Springjdbc10.business.EmployeeBusinessImpl;
import com.krishna.Springjdbc10.dto.Employee;

public class App 
{
    public static void main( String[] args )
    {
      
      //create spring container
    	ApplicationContext context= new ClassPathXmlApplicationContext("configmetadata.xml");
    	
    	EmployeeBusiness employeeBusiness =(EmployeeBusinessImpl)context.getBean("employeeBusiness");
    	
    	Employee emp=new Employee("14","SriSrinivas",19);    	
    	employeeBusiness.insertEmployee(emp);
    	
    	
    	
    	//employeeBusiness.printEmployeeHikes();
    	
    	Employee employee= null;
    	
    	 try {
			employee = employeeBusiness.getEmployeeById("1");
		} catch (Exception e) {
		
		}
    	
    	
    	if(employee!=null)
    		System.out.println(employee.toString());
    	else  
    	
    	  System.out.println("No Matching records found");
    	
    	
    }
}
