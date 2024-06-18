package com.nani.www;

public class Palindrome {
	public static void main(String args[])
	{
		int num=151 ;
		int backup=num;
		int re=0;
		while(num!=0)
		{
			re=re*10+num%10;
			num=num/10;
			
		}
		if(backup==re)
		{
			System.out.println(backup+"is a palindrome number");
		}
		else
		{
			System.out.println(backup+"number is not a palindrome number");
		}

	}

}
