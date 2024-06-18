package com.twg.spring1.mysecondproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Teacher {
	
	private String name;
    private String address;
    @Autowired
    @Qualifier("bp")
    private Pen tpen;
    
    public Teacher()
    {
    	
    }
    public Teacher(Pen p)
    {
    	this.tpen=p;	
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Pen getTpen() {
		return tpen;
	}
	public void setTpen(Pen tpen) {
		this.tpen = tpen;
	}
    
    
	

}
