
 package com.twg.spring.springhibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.twg.spring.springhibernate.business.EmployeeBusinessImpl;
import com.twg.spring.springhibernate.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("configmetadata.xml");
       
       EmployeeBusinessImpl employeeBusiness=(EmployeeBusinessImpl)context.getBean("employeeBusinessImpl");
       
       Employee employee = new Employee();
       
       employee.setAddress("Hyderabad");
       employee.setContact("8985656365");
       employee.setEname("Krishna");
       employee.setExp(10);
       employee.setId(1);
       
       employeeBusiness.save(employee);
       
    }
    
}
