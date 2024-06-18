package com.Krishna.www;

public class FactorialProgram1 {
	public static void main(String args[])
	{
		factorial();
		factorialrecursive();
	}
	private static void factorial()
	{
		int n=5;
		int sum=1;
		for(int i=1;i<=n;i++)
		{
			sum=sum*i;
			
		}
		System.out.println(sum);
	}
	private static void factorialrecursive()
	{
		int n=5;
		int value=factorialmethod(n);
		System.out.println(value);
	}
	private static int factorialmethod(int n)
	{
		if(n==0)
			return 1;
		else
			return n*factorialmethod(n-1);
		
	}
}
