package com.krishna.APPlication01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("configmetadata.xml");
        Student student=(Student) applicationContext.getBean("customer");
        student.getStudentDetails();

    }
}
