package com.durgasoft.www.BeanFactoryEx;

import java.io.IOException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.durga.beans.Employee;

public class App 
{
    public static void main( String[] args ) throws IOException
    {

        Resource resource=new ClassPathResource("configmetadata.xml");
        System.out.println("Resource Object Created.....");
        System.in.read();

        BeanFactory beanfactory=new XmlBeanFactory(resource);
        System.out.println("beanFactory Object is Created....");
        System.in.read();
        Employee emp=(Employee)beanfactory.getBean("employee");
        System.out.println("Getting Employee Object....");
        System.in.read();

        emp.getEmployeedetails();
    }
}
