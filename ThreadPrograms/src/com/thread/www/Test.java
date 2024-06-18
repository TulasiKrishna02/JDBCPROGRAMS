package com.thread.www;

import java.lang.reflect.Method;

public class Test {
	public static void main(String args[])
	{
		int count=0;
		Object o=new String("durga");
		Class c=o.getClass();
		System.out.println("FullyQualified Name Of Class:"+c.getName());
		Method[] m=c.getDeclaredMethods();
		System.out.println("method informtion:");
		for(Method m1:m)
		{
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("The no of method:"+count);
		
	}
		
	 
	
	}


