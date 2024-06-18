package com.twg.setterinjection.tulasi;
import java.sql.*;  
public class JdbdEx{  
/*public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/school","root","Tulasi@123");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from student");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  */
	public static void main(String args[])
	{
	      try{

	    //step-1  : Register the driver
		
	    	  Class.forName("com.mysql.jdbc.Driver"); 
	    	  Connection con=DriverManager.getConnection(  
	    			  "jdbc:mysql://localhost:3306/school","root","Tulasi@123");
	    

	    //step-2 :get the connection
	    	  //String url="jdbc:mysql://localhost:3306/school";

	      //Connection con = DriverManager.getConnection("url","username","password");



	    //step-3  Create the statement object
	  

	      Statement stmt = con.createStatement();


	    //step-4  Execute the queries

	    //stmt.executeUpdate("insert into student values(1,'KRISHNA')");
	    //stmt.executeUpdate("insert into student values(1,'TULASI')");
	      ResultSet res=stmt.executeQuery("select * from student");
	      while(res.next())
	      {
	    	  
	      System.out.println(res.getInt("rno")+"\t"+res.getString("name"));
	      //System.out.println(res.getString("name"));
	      }

	   //step-5 close the connection
	     
	     con.close();
	     
	     System.out.println("Insert successfully");
	}
	catch(Exception e)
	{
	System.out.println(e);
	}


	}


	}