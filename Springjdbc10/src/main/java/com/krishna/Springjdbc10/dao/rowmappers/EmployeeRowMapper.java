package com.krishna.Springjdbc10.dao.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.krishna.Springjdbc10.dto.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{
	
	public Employee mapRow(ResultSet rs,int rowNum)throws SQLException{
		
		Employee employee=new Employee();
		
		employee.setId(rs.getString(1));
		employee.setName(rs.getString(2));
		employee.setExp(rs.getInt(3));
		
		return employee;
		
	}
	

}
