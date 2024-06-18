package com.krishna.Springjdbc10.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.krishna.Springjdbc10.dto.Employee;
import com.krishna.Springjdbc10.dao.rowmappers.EmployeeRowMapper;

public class EmployeeDaoImpl implements EmployeeDao{
	
	private static final String EmployeeRowMapper=null;
	JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	

	@Override
	public void insertEmployee(Employee employee) {
		
		//code to insert employee object into data base
		
		String sql="insert into employ values(?,?,?)";
		System.out.println("Query :"+sql);
		
		jdbcTemplate.update(sql,employee.getId(),employee.getName(),employee.getExp());
		
		
	}

	@Override
	public List<Employee> findAllEmployees() {
		//code to return all employees in employee table
		EmployeeRowMapper rowMapper=new EmployeeRowMapper();
		List<Employee> employees=jdbcTemplate.query("select * frrom employ", rowMapper);
		
		return employees;
	}

	@Override
	public Employee getEmployeeById(String id) {
        //code to get employee based on particular id
		EmployeeRowMapper rowMapper=new EmployeeRowMapper();
        Employee employee=jdbcTemplate.queryForObject("select * from employ where id=?",rowMapper,id);
        
		
		return employee;
	}

}
