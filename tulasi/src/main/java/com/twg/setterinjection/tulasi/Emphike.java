package com.twg.setterinjection.tulasi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Emphike {

	public static void main(String[] args) {
		
		//jdbc logic
		try {
		
		
		 Class.forName("com.mysql.cj.jdbc.Driver"); 
   	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/springjdbc","root","Tulasi@123");
   	  
   	  Statement stmt=con.createStatement();
   	  
   	  ResultSet rs=stmt.executeQuery("select*from employee");
   	  //con.close();   	  
   	  while(rs.next()) {
   		  
   		String id=rs.getString(1);
   		String name=rs.getString(2);
   		int exp=rs.getInt(3);
   		
   		
   		//business logic
   		
   		
   		if(exp>=15)
   		{
   			
   			System.out.println("Employee with id "+id+" and name "+name+" with experiance"+exp+" got 30% hike");
   			
   		}
   		else if(exp>=10)
   		{
   			System.out.println("Employee with id "+id+" and name "+name+" with experiance"+exp+" got 25% hike");
   			
   		}
   		else if(exp>=5)
   		{
   			System.out.println("Employee with id "+id+" and name "+name+" with experiance"+exp+" got 20% hike");
   			
   		}
   		else {
   			System.out.println("Employee with id "+id+" and name"+name+" with experiance"+exp+" got 15% hike");
   		}
   		}
   		  
   	      con.close();
   	  
		}
		
		catch(Exception e)
		{
			
			System.out.println(e);		}
   

	}

}
