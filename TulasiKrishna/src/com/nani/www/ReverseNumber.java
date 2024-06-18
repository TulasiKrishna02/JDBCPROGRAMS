package com.nani.www;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A Number:");
		
		int num=sc.nextInt();
		int orgnum = num;
		
		int rev=0;
		
		while(num!=0)
		{
			
			rev=rev*10+num%10;
			
			num=num/10;
			}
		
		
		if(orgnum==num)
		{
			
			System.out.println(+orgnum+"The number is palindrome number");
			
		}
		else
		{
			
			System.out.println(+orgnum+"The number is not a palindrom");
			
			
		}
		
		
		
		
		
		
	}

}
