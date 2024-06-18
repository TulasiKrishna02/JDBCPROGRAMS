package com.Krishna.www;
//write a program fibnocci Serice.
public class FibnocciSreies {
	public static void main(String args[])
	{
		int a=0,b=1,sum=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<10;i++)
		{
		sum=a+b;
		System.out.println(sum);
		b=sum;
		a=b;
		}
	}

}
