package com.nani.www;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
      int n =sc.nextInt();
      int backup=n,sum=0;
      while(n>0)
      {
    	  sum=sum+(n%10)*(n%10)*(n%10);
    	  n=n/10;
    	  System.out.println(sum);
      }
      if(sum==backup)
      {
    	  System.out.println("It is a armstrong number");
    	  
      }
      else
      {
    	  System.out.println("It is not a armstrong number");
      }
      
     
		
	}

}
