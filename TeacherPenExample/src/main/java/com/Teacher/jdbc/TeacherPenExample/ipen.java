package com.Teacher.jdbc.TeacherPenExample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ip")
public class ipen implements pen {
	public String toString()
	{
		return "ipen";
	}
	public ipen()
	{
		System.out.println("Constructor logics");
	}
	public void write()
	{
		System.out.println("Inkpen Implementation");
	}

}
