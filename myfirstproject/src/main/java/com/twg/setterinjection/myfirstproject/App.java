package com.twg.setterinjection.myfirstproject;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//creating spring container
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("configmetadata.xml");
    	
    	//Application context is a interface so,we can use sub classes of application context.
    	
    	//get customer object
    	
    	/*Customer customer =(Customer)context.getBean("cus");  //object type ni customer type ga convert chesam
  
    	System.out.println("Name:"+customer.getName());
    	System.out.println("contact:"+customer.getContact());
    	System.out.println("Address:"+customer.getAddress());*/
    	
    	
    	/*Order order =(Order)context.getBean("ord");
    	
    	System.out.println("order id:"+order.getProductid());
    	System.out.println("order name:"+order.getProductname());
    	System.out.println("order date:"+order.getOrderdate());
    	
    	System.out.println("Customer name:"+order.getCustomer().getName());
    	System.out.println("Customer :"+order.getCustomer().getAddress());*/
    	
    	//get Customer
    	Customer customer=(Customer) context.getBean("customer");
    	
    	System.out.println("customer details:"+customer.toString());
    	
    	//check order details
    	Order order=(Order) context.getBean("order");
    	System.out.println("Order details :" +order.toString());
    	
    	
    	
    	
    }
}
