package com.nani.www;
 class Test6 {
	 
	 int rno;
	 String Name;

	 Test6()
	 {
		 
		 System.out.println("Default Constructor");
		 
	 }
	  
	 Test6(int a)
	 {
		 
		 System.out.println("a= "+a);
		 
	 }
	 Test6(int b,String str)
	 {
		  rno = b;
		  Name = str;
		 System.out.println(rno);
		 System.out.println(Name);
		 
	 }
	
	
}

public class Test5
{
public static void main(String args[]) 
{
	
	
	Test6 t1=new Test6();
	Test6 t2=new Test6(45);
	Test6 t3=new Test6(586,"Tulasi");
	System.out.println(t3.rno);
	System.out.println(t3.Name);
	
	
}	


}
