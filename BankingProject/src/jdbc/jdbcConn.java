package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class jdbcConn {
	public static void main(String[] args) throws Exception {
		
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/testDb", "name", "pass");
		
		
		PreparedStatement updateemp = con.prepareStatement("insert into emp values(?,?,?)");
		updateemp.setInt(1, 23);
		updateemp.setString(2, "Roshan");
		updateemp.setString(3, "CEO");
		updateemp.executeUpdate();
		
		//		or
		//	PreparedStatement ps=con.prepareStatement("select * from emp");  
		//	ResultSet rs=ps.executeQuery(); 
		
		Statement stmt = con.createStatement();
		String query = "select * from emp";
		ResultSet rs = stmt.executeQuery(query);
		
		
		System.out.println("Id Name    Job");
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String job = rs.getString("job");
			System.out.println(id + "  " + name + "   " + job);
		}
		
		ResultSetMetaData rsmd=rs.getMetaData();  
		  
		System.out.println("Total columns: "+rsmd.getColumnCount());  						//	3
		System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  			//	ID
		System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));  	//NUMBER
	}
}

/*
	public int getColumnCount()throws SQLException	-->  it returns the total number of columns in the ResultSet object.
	public String getColumnName(int index)throws SQLException	-->  it returns the column name of the specified column index.
	public String getColumnTypeName(int index)throws SQLException	-->  it returns the column type name for the specified index.
	public String getTableName(int index)throws SQLException	-->  it returns the table name for the specified column index.
*/



//http://stackoverflow.com/questions/4333015/does-the-preparedstatement-avoid-sql-injection
//http://www.theserverside.com/news/1365244/Why-Prepared-Statements-are-important-and-how-to-use-them-properly