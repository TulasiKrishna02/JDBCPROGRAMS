package com.twg.spring1.mysecondproject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ip")
public class InkPen implements Pen{
	
	public InkPen()

	{
		System.out.println("The INk pen constructor");
		
	}
	
	 @Override
	public String toString() {
		return "InkPen [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public void write()
	 {
		 
		 System.out.println("This is second pen Implementation class");
		 
		 
	 }

}
