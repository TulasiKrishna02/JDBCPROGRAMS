package com.twg.spring1.mysecondproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestMainJavaConfig 
{
	@Bean
	public Teacher getTeacher()
	{
		
		Teacher t=new Teacher();		
		return t;
	}
	
	//@Bean(name="bp")
	public BallPen ballPen() 
	{
		
		BallPen bp=new BallPen();
		return bp;
		
	}
	@Bean(name="ip")
	public InkPen inkPen()
	{
		InkPen ip= new InkPen();
		return ip;
		
	}
}
	


