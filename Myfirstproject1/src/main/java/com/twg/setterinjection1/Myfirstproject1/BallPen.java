package com.twg.setterinjection1.Myfirstproject1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bp")
public class BallPen implements Pen
{
	public BallPen()
	{
		
		System.out.println("In b pen Constructor");
	}
	
	
	@Override
	public String toString() {
		return "BallPen [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


	public void write()
	{
		
		System.out.println("Teacher is using Ball Pen");
		
		
	}
	
	

}
