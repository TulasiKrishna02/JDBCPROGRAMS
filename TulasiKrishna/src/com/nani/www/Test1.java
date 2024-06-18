package com.nani.www;

import java.util.function.*;
class Test1 
{
	public static void main(String args[])
	{
	   String[] s= {"NAg","Chiranjeevi","Venkatesh","Balaiah","Suny","Katrina"};
	   
	   Predicate <String> p=s1->s1.length()%2==0;
	   
	   for(String s1 : s)
	   {
		   if(p.test(s1))
		   {
			   
			   System.out.println(s1);
			  
			   
		   }
		   
		   
		   
	   }
	   
      
	}
}