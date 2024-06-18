package com.nani.www;

import java.util.ArrayList;
import java.util.function.Predicate;

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
public class Test2 {
	
	
	public static void main(String args[])
	{
		ArrayList<Employee> l=new ArrayList<Employee>();
		l.add(new Employee("Durga",1000));
		l.add(new Employee("Ravi",2000));
		l.add(new Employee("Shiva",3000));
		l.add(new Employee("Mahesh",4000));
		l.add(new Employee("Adarash",5000));
		l.add(new Employee("Sagar",6000));
		
		
		
		Predicate<Employee>p = e -> e.salary>3000;
		
		for(Employee e1 : l)
		{
			
			if(p.test(e1))
			{
				System.out.println(e1.name+":"+e1.salary);
				
			}
			
		}
		
	}
	
	
}


