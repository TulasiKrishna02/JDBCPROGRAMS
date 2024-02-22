package Jdbc1;
import java.sql.*;
import java.sql.DriverManager;

import com.mysql.cj.xdevapi.Statement;

public class abc {

	public static void main(String[] args) {
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/college";
		String username="root";
		String password="Tulasi@123";
		try {
			
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,username,password);
			Statement stmt=(Statement) con.createStatement();
			((java.sql.Statement) stmt).executeQuery("select*from student");
			con.close();
		}
		catch(Exception e)
		{
		System.out.println(e);	
		}

	}

}
