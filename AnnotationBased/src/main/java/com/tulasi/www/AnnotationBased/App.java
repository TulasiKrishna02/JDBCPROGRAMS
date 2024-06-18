package com.tulasi.www.AnnotationBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.durgasoft.beans.Welcome;
import com.durgasoft.config.AppConfig;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        
        
        
       Welcome welcome = (Welcome) applicationContext.getBean("welcome");
        System.out.println(welcome.sayWelcome());


        
        
    }
}
