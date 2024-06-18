package connection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class Xyz {
		public static void main(String[] args) {
			String driver="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/college";
			String username="root";
			String password="Tulasi@123";
			try {
				InputStreamReader i=new InputStreamReader(System.in);
				BufferedReader b=new BufferedReader(i);
				System.out.println("please Enter your Student Id:");
				int sid=b.read();
				System.out.println("Please Enter your name:");
				String sname=b.readLine();
				System.out.println("Please Enter your Percentage:");
				int perc=b.read();
				Class.forName(driver);
				Connection con=DriverManager.getConnection(url,username,password);
				Statement stmt=con.createStatement();
				String qry=("insert into student values(+sid+,'"+sname+"','+perc+')");
				System.out.println("our Query is:"+qry);
				executeUpdate(qry);
				con.close();
			}
			catch(Exception e)
			{
			System.out.println("exception");
			e.printStackTrace();	
			}

		}

		private static void executeUpdate(String qry) {
			// TODO Auto-generated method stub
			
		}

	}


