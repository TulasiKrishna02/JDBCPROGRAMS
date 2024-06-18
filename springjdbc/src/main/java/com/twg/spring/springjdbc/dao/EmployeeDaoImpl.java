package com.twg.spring.springjdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.twg.spring.springjdbc.dao.rowmappers.EmployeeRowMapper;
import com.twg.spring.springjdbc.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	  private static final String EmployeeRowMapper = null;
	JdbcTemplate jdbcTemplate;

	
	


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public static String getEmployeerowmapper() {
		return EmployeeRowMapper;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insertEmployee(Employee employee) {
		
          //code to insert employee objects into databases
		
		
		/*String sql="insert into employee values('"+employee.getId()+"','"+employee.getName()+"',"+employee.getExp()+")";*/
		
		String sql="insert into employee values(?,?,?)";
		
		System.out.println("Query :"+sql);
		
		jdbcTemplate.update(sql,employee.getId(),employee.getName(),employee.getExp());
		
		
	}
	
	public List<Employee> findAllEmployees(){
		
		
		
       EmployeeRowMapper rowMapper=new EmployeeRowMapper();

		List<Employee> employees=jdbcTemplate.query("select * from employ", rowMapper);
		
	       return employees;
	}

	public Employee getEmployeeById(String id) {
		
		
		//code to get employee based on particular id
		
		 EmployeeRowMapper rowMapper=new EmployeeRowMapper();
		Employee employee = jdbcTemplate.queryForObject("select * from employ where id=?", rowMapper,id);
		
	
		return employee;
	}

}

