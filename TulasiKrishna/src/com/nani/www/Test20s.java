package com.nani.www;

import java.util.ArrayList;

import java.util.function.BiFunction;
import java.util.function.Function;
class Emp1
{
	
int eno;
String name;
Emp1(int eno,String name)
{
this.eno=eno;
this.name=name;
}
}

class Test20 {
	public static void main(String args[])
	{
		ArrayList<Emp1> l= new ArrayList<Emp1>();
		
		BiFunction<Integer,String,Emp1> f=(eno,name)->new Emp1(eno,name);
		//Emp1 e1=f.apply(100,'durga');
		
		l.add(f.apply(100,"Durga"));
		l.add(f.apply(200,"pavan"));
		l.add(f.apply(300,"kamal"));
		l.add(f.apply(400,"shiva"));
		 for(Emp1 e : l)
		 {
			 System.out.println("Emp1 Number:"+e.eno);
			 System.out.println("Emp1 name:"+e.name);
			 System.out.println();
			 
			 
		 }
		
	}
	
	

}
