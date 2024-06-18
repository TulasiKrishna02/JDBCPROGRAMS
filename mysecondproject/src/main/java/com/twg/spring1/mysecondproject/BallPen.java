package com.twg.spring1.mysecondproject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class BallPen implements Pen
{
	public BallPen()
	{
		System.out.println("In bpen constructor");
		
	}
	public void write()
	{
		System.out.println("This Pen Implementation class");
		
		
	}

}
