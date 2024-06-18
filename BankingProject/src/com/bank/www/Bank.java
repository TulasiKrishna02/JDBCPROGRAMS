package com.bank.www;

import java.util.HashMap;
import java.util.Map;
public class Bank {
	
private Map<String,BankAccount> accounts;

public Bank() 
{
	accounts=new HashMap<>();
}
public void addAccount(String accountNumber,String owner,double initialBalance)
{
	
	BankAccount newAccount= new BankAccount(accountNumber,owner,initialBalance);
	accounts.put(accountNumber,newAccount);
	
}
public BankAccount getAccount(String accountNumber) {
	return accounts.get(accountNumber);
	

}


}



