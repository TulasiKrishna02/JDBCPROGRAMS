package com.bank.www;

public class BankAccount {
	
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
public String getOwner()
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



