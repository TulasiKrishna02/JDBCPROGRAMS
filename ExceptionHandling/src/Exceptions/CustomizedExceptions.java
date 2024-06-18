package Exceptions;

class TooYoungException extends RuntimeException
{
	TooYoungException(String s)
	{
		super(s);
	}

}
class TooOlderException extends RuntimeException
{
	TooOlderException(String s)
	{
		super(s);
	}

}

public class CustomizedExceptions {
	public static void main(String args[])
	{
		int age=Integer.parseInt(args[1]);
		if(age>60)
		{
			throw new TooYoungException("plz waite some more time..... you will get best match soon");
		  
		}
		else if(age<18)
		{
			throw new TooOlderException("Your age is already crossed marriage age...no chance of getting marriage");
		}
		else
		{
			System.out.println("you will get match details soon by email...!");
		}
	}
	

}
