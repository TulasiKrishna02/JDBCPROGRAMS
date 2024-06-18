package com.twg.setterinjection1.Myfirstproject1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ip")
public class InkPen implements Pen{
	
	  @Override
	public String toString() {
		return "InkPen [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public void write()
	  {
		  
		  System.out.println("Teacher is using Ink pen");
		  
	  }
	

}
