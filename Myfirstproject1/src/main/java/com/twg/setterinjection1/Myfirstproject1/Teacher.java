package com.twg.setterinjection1.Myfirstproject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
	
	private String name;
	private String address;
	
	@Autowired
	@Qualifier("ip")
	private Pen tpen;
	
	public Pen getTpen() {
		return tpen;
	}


	public void setTpen(Pen tpen) {
		this.tpen = tpen;
	}


	public Teacher() {}
	

	public Teacher(Pen tpen) {
		
		this.tpen = tpen;
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

	

	
}
