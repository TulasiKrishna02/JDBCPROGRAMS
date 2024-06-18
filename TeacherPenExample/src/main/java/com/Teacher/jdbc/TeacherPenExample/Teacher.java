package com.Teacher.jdbc.TeacherPenExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Teacher {
	private String name;
	private int age;
	@Autowired
	@Qualifier("ip")
	private pen tpen;

	public pen getTpen() {
		return tpen;
	}
	public void setTpen(pen tpen) {
		this.tpen = tpen;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public int getage()
	{
		return age;
	}

}
