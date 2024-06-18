package com.twg.spring1.mysecondproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      try {
    	//ApplicationContext context= new ClassPathXmlApplicationContext("configmetadata.xml");
    	
    	ApplicationContext ctx=new AnnotationConfigApplicationContext(TestMainJavaConfig.class);
    	
    	Teacher t=(Teacher)ctx.getBean("getTeacher");
    	
    	System.out.println(t.getName()+" "+t.getAddress()+" "+t.getTpen());
          
    	
      }
      catch(Exception e)
      {
    	
       System.out.println(e);
    	
    	
    	
    }
}}
