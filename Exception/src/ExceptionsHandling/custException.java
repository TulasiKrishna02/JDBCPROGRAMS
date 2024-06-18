package ExceptionsHandling;
//customized Exception Example.
import java.util.Scanner;

class youngerException extends RuntimeException
{
	public youngerException(String s)
	{
		super(s);
	}
	
}
class elderException extends RuntimeException
{
	elderException(String s)
	{
		super(s);
	}

}
public class custException {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your age:");
		int age=sc.nextInt();
		if(age<18)
		{
			throw new youngerException("You are not eligible for vote please wait "+(18-age)+"  years");
		}
		else if(age>68)
		{
			throw new youngerException("You are eligible for vote please Apply the vote");	
		}
		else
		{
			System.out.println("Hello please enter your valid date");
		}
		
	}

}
