package com.Krishna.www;

import java.util.Scanner;

public class Roots {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		double a=sc.nextDouble();
		System.out.println("Enter b value");
		double b=sc.nextDouble();
		System.out.println("Enter c value");
		double c=sc.nextDouble();
		double d=(b*b)-(4*a*c);
		double root1,root2;
		if(d==0)
		{
			System.out.println("Roots are real and equal");
			root1=root2=-b/(2*a);
			System.out.format("root1=%.2f", root1);
			System.out.format("root2=%.2f", root2);
		}
		else if(d>0)
		{
			System.out.println("Roots are real and distinct");
			root1=(-b+Math.sqrt(d))/(2*a);
			root2=(-b-Math.sqrt(d))/(2*a);
			System.out.format("root1=%.2f", root1);
			System.out.format("root1=%.2f",root2);
		}
		else
		{
			System.out.println("Roots are complex");
			double real=-b/(2*a);
			double img=Math.sqrt(-d)/(2*a);
			System.out.format("root1=%.2f+i%.2f",real,img);
			System.out.format("root2=%.2f",real,img);
		}
	}

}
