package com.nani.www;

import java.util.ArrayList;
import java.util.function.BiFunction;
//import java.util.function.Function;
class Emp
{
	
int eno;
String name;
Emp(int eno,String name)
{
this.eno=eno;
this.name=name;
}
}

class BiFunction1 {
	public static void main(String args[])
	{
		ArrayList<Emp> l= new ArrayList<Emp>();
		
		BiFunction<Integer,String,Emp> f=(eno,name)->new Emp(eno,name);
		//Emp e1=f.apply(100,'durga');
		
		l.add(f.apply(100,"Durga"));
		l.add(f.apply(200,"pavan"));
		l.add(f.apply(300,"kamal"));
		l.add(f.apply(400,"shiva"));
		 for(Emp e : l)
		 {
			 System.out.println("Emp Number:"+e.eno);
			 System.out.println("Emp name:"+e.name);
			 System.out.println();
			 
			 
		 }
		
	}
	
	

}
