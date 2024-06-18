package com.twg.setterinjection.myfirstproject;

public class Customer
{
	
       private String name;
       private String contact;
       private String address;
       
       public Customer()
       {}       
       
	public Customer(String name,String contact,String address)
	{
		
		this.name=name;
		this.contact=contact;
		this.address=address;
		
		
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", contact=" + contact + ", address=" + address + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	

}