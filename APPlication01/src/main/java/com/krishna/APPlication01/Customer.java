package com.krishna.APPlication01;

public class Customer {
	
	private String customerid;
	private String customerName;
	private String customerAddress;
	
	
	
	
	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public Customer(String customerid, String customerName, String customerAddress) {
		super();
		this.customerid = customerid;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
	
	 public void getCustomerDetails(){
	       System.out.println("Customer Details");
	       System.out.println("-----------------------");
	       System.out.println("Customer Id       : "+customerid);
	       System.out.println("Customer Name     : "+customerName);
	       System.out.println("Customer Address  : "+customerAddress);
	   }
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	 


}
