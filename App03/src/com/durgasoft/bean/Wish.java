package com.durgasoft.bean;

import java.time.LocalTime;

public class Wish {
	public String sayWish()
	{
		String message="";
		LocalTime time=LocalTime.now();
		int hour=time.getHour();
		
		if(hour<12)
		{
			message="Good Morning";
		}
	
		else if(hour<17)
		{
			message="Good Afternoon";
		}
		else if(hour<24)
		{
			message="Good evening";
		}
		return "Hello user, "+message;
		
	}

}
