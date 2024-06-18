package com.Teacher.jdbc.TeacherPenExample;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
      ApplicationContext a=new ClassPathXmlApplicationContext("configmetadata.xml");
      
     Student t1=(Student)a.getBean("stid");
      System.out.println(t1.getName()+" "+t1.getId());
      List<String> ms=t1.getMarks();
      System.out.println(ms);
      List<Books> bs=t1.getBooks();
      System.out.println(bs);
    }
}
