package com.nani.www;
class A
{
	int rno;
	String a;
	
     A()
     {
    	 System.out.println("Default Constructor");
    	 
     }
     A(int a)
     {
    	 
    	 System.out.println("a= :"+a);
    	 System.out.println("PArameterazied Constructor");
     }
     A(String name,int no)
     {
    	 a = name;
    	 rno = no;
    	 
    	 System.out.println("2 Parametarized constructor.");
    	 
    	 
     }

}

class B
{
 void display()
 {
	System.out.println("This is display method:");
	 
 }
 void display(int a)
 {
	 
	 System.out.println("a= "+a);
	 
 }


}
class C
{
int z=10;
void display()
{
	int z=60;
	
System.out.println(z);
System.out.println(this.z);
}

}

class SampleClass
{
	int a=50,b=70;
public static void main(String args[])
{
	
A obj=new A();
A obj1=new A(123);
A obj2=new A("TULASI",789);
System.out.println(obj2.a);
System.out.println(obj2.rno);
B obj3=new B();
obj3.display();
obj3.display(100);
//System.out.println();

SampleClass obj4=new SampleClass();
System.out.println("A+B :"+obj4.a+obj4.b);
System.out.println("A+B :"+(obj4.a+obj4.b));
C obj5=new C();
obj5.display();


}



}
