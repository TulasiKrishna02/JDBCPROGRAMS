package com.durgasoft.www.App01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext  context= new ClassPathXmlApplicationContext("configmetadata.xml");
    	
    	Welcome app=(Welcome)context.getBean("Welcome");
    	String s=app.sayBean();
    	System.out.println(s);
    }
}
