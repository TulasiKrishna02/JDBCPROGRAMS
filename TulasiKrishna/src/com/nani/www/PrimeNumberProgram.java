package com.nani.www;

public class PrimeNumberProgram {
	public static void main(String args[])
	{int j;
		for(int i=1;i<=10;i++)
		{ int count=0;
			for( j=1;j<=10;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
	}


}
