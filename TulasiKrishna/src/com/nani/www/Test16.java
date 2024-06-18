package com.nani.www;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employee 
{
	String name;
	double salary;
	Employee(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}

}
class Test16
{
public static void main(String args[])
{
	
ArrayList<Employee> l=new ArrayList<Employee>();
populate();
BiConsumer<Employee,Double>c=(e,d)->e.salary=e.salary+d;
	for(Employee e:l)
	{
		c.accept(e, 500);	

	}
	(Employee e:1)
	{
	
		System.out.println("Employee name :"+e.name);
		System.out.println("Employeensalary :"+e.salary);
	}
}
public static void populate()
{
	l.add(new Employee("Durga",1000));
	l.add(new Employee("Sunny",2000));



}




}