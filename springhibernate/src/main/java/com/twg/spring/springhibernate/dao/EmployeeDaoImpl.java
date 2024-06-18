package com.twg.spring.springhibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.twg.spring.springhibernate.entities.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		
		this.hibernateTemplate = hibernateTemplate;
		
	}
	
	
    @Transactional
	public void save(Employee employee) {
		
		hibernateTemplate.save(employee);
		
	}

	public void update(Employee employee) {

	     hibernateTemplate.update(employee);
	}

	public void delete(Employee employee) {

		hibernateTemplate.delete(employee);
	}

	public Employee findById(int id) {
		
	 Employee emp=hibernateTemplate.get(Employee.class, id);
		return emp;
	}

	public List<Employee> findAll() {
		
		
		
		return hibernateTemplate.loadAll(Employee.class);
	}
	
	
	
	
	
	
	

}
