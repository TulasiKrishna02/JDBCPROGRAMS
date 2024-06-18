package com.java8.www;
interface Left
{
public static void m1()
{
System.out.println("Left interface m1 method");	
}
public static void main(String args[])
{
System.out.println("Interface main method");	
}
}
public class Test4 implements Left{
	public static void main(String arg[])
	{
		Left.m1();
		
	}

}
