package com.nani.www;

import java.util.Scanner;

public class LargestOfThreenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		
		int a=sc.nextInt();
		
		System.out.println("Enter Second Number: ");
		int b=sc.nextInt();
		System.out.println("Enter Third Number: ");
		int c=sc.nextInt();
		
		//First approach
		
		/*if(a>b&&a>c)
		{
			
			
			System.out.println(a+" ia LArgest number");
		}
		else if(b>a&&b>c)
		{
			System.out.println(b+" is b large number");
			
		}
		else
		{
			
			System.out.println(c+"is a largest number");
		}*/
		
		
		//Ternary operator in java
		
		/*int largest=a>b?a:b;
		int largest2=c>largest?c:largest; //largest of c & largest 1*/
		
		int largest=c>(a>b?a:b)?c:(a>b?a:b); //ternary operator combining
		
		System.out.println(largest+" is largest");
		
	}

}
