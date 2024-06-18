
package com.twg.spring1.springjdbc1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.twg.spring.springjdbc.business.EmployeeBusiness;


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
    	
    	EmployeeBusiness employeeBusiness =(EmployeeBusiness)context.getBean("employeeBusiness");
    	
    	employeeBusiness.printEmployeeHikes();
    	
    }
}