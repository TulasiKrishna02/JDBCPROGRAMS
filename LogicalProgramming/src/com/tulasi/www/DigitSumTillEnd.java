package com.tulasi.www;

public class DigitSumTillEnd {
	public static void main(String args[])
	{
		int number=999;
		int sum;
		int n;
		while(number>9)
		{
			sum=0;
			n=0;
			while(number>0)
			{
				n=number%10;
				sum=sum+n;
				number=number/10;
			}
			number=sum;
		}
		System.out.println("Digit sum till the end is:"+number);
	}

}
//output:Digit sum till the end is:9
