package com.nani.www;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;



		//Consumer<String> c=s->System.out.println(s);
		
		//c.accept("durga");
		//c.accept("Durga Software");
	

/*class Student2
{
			String name;
			int marks;
			Student2(String name,int marks)
			{
			   this.name=name;
			   this.marks=marks;   
		    }
}*/
public class Test12
{
		public static void main(String args[])
		{
		         Function<Student,String> f=s->{
					
					int marks=s.marks;
					String grade="";
					if(marks>=80) grade="A[Dictinction]";
					else if(marks>=60) grade="B[First class]";
					else if(marks>=50) grade="C[Second class]";
					else if(marks>=35) grade="D[Third class]";
					else grade="E[Failed]";
					return grade;
				    };
				    
				    Predicate<Student> p=s->s.marks>=60;
				    
				    Consumer<Student> c=s1->
				    {
				    	System.out.println("Student Name:"+s1.name);
						System.out.println("Student Marks"+s1.marks);
						System.out.println("Student Grade:"+f.apply(s1));
						System.out.println();
				    	
				    	
				    };
				
			       Student[] s={new Student("Durga",100),
								new Student("Sunny",65),
								new Student("Bunny",45),
								new Student("Vinny",25)
						      
						       };
				
					
				for(Student s1 : s)
				{
					if(p.test(s1))
					{
					
					c.accept(s1);
					
					}
					
				}
				
				
				
			
			

		}

		
		
	}


