package com.Krishna.www;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter a number");
		int n=sc.nextInt();
		int rev=0,backup=n;
		while(n>0)
		{
		rev=rev*10+n%10;
		n=n/10;
		}
		if(backup==rev)
		{
		System.out.println("It is palindrome number");
		}
		else
		{
			System.out.println("It is not a palindrome number");
		}
	}

}
