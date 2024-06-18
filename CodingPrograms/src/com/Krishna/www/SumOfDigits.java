package com.Krishna.www;
//write a program to print sum of digits of the given number
import java.util.Scanner;

public class SumOfDigits {
public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	int sum=0;
	while(n>0)
	{
	sum=sum+n%10;
	n=n/10;
	}
	System.out.println(sum);
	}
  
}
