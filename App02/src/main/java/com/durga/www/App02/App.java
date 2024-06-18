package com.durga.www.App02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ap=new ClassPathXmlApplicationContext("configmetadata.xml");
        Wish s=(Wish)ap.getBean("wish");
        System.out.println(s.sayWish());
        
       
    }
}
