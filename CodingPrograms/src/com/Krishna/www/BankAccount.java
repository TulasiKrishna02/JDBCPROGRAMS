package com.Krishna.www;

import java.util.HashMap;
import java.util.Map;

 class BankAccount {
	private String accountNumber;
	private String owner;
	private double balance;
	public BankAccount(String accountNumber,String owner,double balance)
	{
		this.accountNumber = accountNumber;
		this.owner=owner;
		this.balance=balance;
		
	}
	
public String getAccountNumber()
{
	return accountNumber;
}
public String Owner()
{
   return owner;	
}
public double getBalance()
{
   return balance;	
}
public void deposit(double amount) {
	balance+=amount;
	
}
public void withdraw(double amount){
	if(amount>balance)
	{
		System.out.println("Insufficient funds..."+"withdrawal cancelled.");
	}
	else 
	{
		balance-=amount;
		System.out.println("withdraw successful"+"Remaining balance:"+balance);
	}
}
}



class Bank{
	private Map<String,BankAccount> accounts;
	public Bank() {
		accounts=new HashMap<>();
	}
	public void addAccount(String accountNumber,String owner,double initialBalance) {
		
		BankAccount newAccount= new BankAccount(accountNumber,owner,initialBalance);
		accounts.put(accountNumber,newAccount);
		
	}
	public BankAccount getAccount(String accountNumber) {
		return accounts.get(accountNumber);
		
	
	}
	
}





