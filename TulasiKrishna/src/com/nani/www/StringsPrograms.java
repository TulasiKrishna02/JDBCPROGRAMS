package com.nani.www;

import java.util.Scanner;

public class StringsPrograms {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String :");
		 
		  String str=sc.nextLine();
		 String rev="";
		  
		  for(int i=0;i<=str.length()-1;i++)
		  {
			  
			  char c=str.charAt(i);
			    rev=c+rev;
		  }
		  if(str.equalsIgnoreCase(rev))
		 
		       System.out.println("yes it is");
		  else
			  System.out.println("no it is not");

	}

}
