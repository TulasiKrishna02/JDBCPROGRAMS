package exceptionHandle;
class A
{

}

public class NoClassDefFoundError
{
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		A a = new A();
	}
}
/*When you compile the above program, two .class files will be generated. 
One is A.class and another one is B.class. 
If you remove the A.class file and run the B.class file, 
Java Runtime System will throw NoClassDefFoundError like below,*/