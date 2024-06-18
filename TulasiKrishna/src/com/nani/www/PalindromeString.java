package com.nani.www;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter a String: ");
		  
		  String str=sc.next();
		  
		  String orgstr =str;
		  
		  String rev="";
		  
		  
		  int len=str.length();
		  
		  for(int i=len-1;i>=0;i--)
		  {
			  
			  rev=rev+str.charAt(i);
			  
		  }
		
		if(orgstr.equals(rev))
		{
			
			System.out.println(orgstr+"  is a palindrome String");
		}
		else
		{
			System.out.println(orgstr+" is not a palindrome String");
			
		}

	}
}
