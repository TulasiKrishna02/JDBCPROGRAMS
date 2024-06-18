package com.nani.www;

public class Armstrong {

	public static void main(String[] args) {
        int num=153;
		int re=num;
		int sum=0;
		while(num>0)
		{
		sum=sum+(num%10)*(num%10)*(num%10);
		num=num/10;
		}

		if(sum==re)
		{

		System.out.println("it is a armstrong number:");
		}
		else{
		System.out.println("It is not a armstrong number:");
		}
		}



		
		
		
	}


