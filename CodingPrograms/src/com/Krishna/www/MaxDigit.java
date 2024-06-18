package com.Krishna.www;

import java.util.Scanner;

//write a program to print max digit from the given number
public class MaxDigit {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter A number");
		int num=sc.nextInt();
         int max=num%10;
         while(num>0)
         {
        	 if(num%10>max)
        	 {
        		 max=num%10;
        	 }
        	 num=num/10;
         }
         System.out.println(max);
	}

}
