package com.Teacher.jdbc.TeacherPenExample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bp")
public class bpen implements pen{
	public String toString()
	{
		return "bpen";
	}
	public void write()
	{
		System.out.println("Pen Implementation-Bpen");
	}

}
