package com.nani.www;

public class NestedIf {
	public static void main(String args[])
	{
		int x=3,y=1,z=5;
		if(x>y)
		{
			if(z<=y)
			{
				System.out.println("Y is greater than z");
			}
			else if(z>=y)
			{
			System.out.println("Z is greater than y");
			}
		System.out.println("x is greater than y");
			
		} 
		else
		{
			if(y>z)
			{
				System.out.println("Y is greater than Z");
			}
			
		}
		
	}

}
