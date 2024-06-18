package com.twg.setterinjection1.Myfirstproject1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context= new ClassPathXmlApplicationContext("Configmetadata.xml");
    	
    	
    	Teacher t1=(Teacher)context.getBean("teacher");
    	
    	  
    	System.out.println(t1.getName()+"  "+t1.getAddress()+" "+t1.getTpen());  	
    	
    	
    	/*Teacher t2=(Teacher)context.getBean("teacher");
    	
  	  
    	System.out.println(t2.getName()+"  "+t2.getAddress()+" "+t2.getTpen()); 
    	
    	
    	if(t1==t2)
    	{
    		System.out.println("Both are Equal ");
    		
    	}else {


    		System.out.println("Not equal");
    		
    		
    	}*/
    	
    	
    	
    }
}
