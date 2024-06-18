package ExceptionsHandling;

import java.util.Scanner;

class tooYoungException extends RuntimeException
{
	tooYoungException(String s)
	{
		super(s);
	}
}
class toooldException extends RuntimeException
{
	toooldException(String s)
	{
		super(s);
	}
	
}

public class CEx {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int val=sc.nextInt();
		if(val<18)
		{
			throw new tooYoungException("You are not eligible for marriage");
		}
		else if(val>60)
		{
			throw new toooldException("You are reached the marriage age");
		}
		else
		{
			System.out.println("You are eligible for marriage.... ");
		}
		
	}

}
