package com.bank.www;

import java.util.Scanner;
public class BankingSystem {
	public static void main(String args[]) {
		
		Scanner scanner=new Scanner(System.in);
		Bank bank=new Bank();
		bank.addAccount("12345","John Doe",1000.0);
		bank.addAccount("67890","Jane Smith",2000.0);
		while(true)
		{
			System.out.println("1.View Account Balance");
			System.out.println("2.Deposit Money");
			System.out.println("3.withdraw Money");
			System.out.println("4.Quit");
			System.out.println("Enter your Account Number: ");
			String accountNumber=scanner.nextLine();
			
			BankAccount currentAccount=bank.getAccount(accountNumber);
			if(currentAccount == null) {
				
				System.out.println("Account not found."+"please enter a valid account number.\n");
				continue;
				
			}
			System.out.println("Welcome,"+currentAccount.getOwner()+"! what would you like you do?");
			int choice =scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			
			
			case 1:
				System.out.println("Account Balance:"+currentAccount.getBalance()+"\n");
				break;
			case 2:
				System.out.println("Enter deposit is amount:");
				double depositAmount=scanner.nextDouble();
				currentAccount.deposit(depositAmount);
				System.out.println("Deposit susseful.update balance:"+currentAccount.getBalance()+"\n");
				break;
			case 3:
				System.out.println("Enter withdrawal amount:");
				double withdrawalAmount=scanner.nextDouble();
				currentAccount.withdraw(withdrawalAmount);
				break;
			case 4:
				System.out.println("Thank you for using banking system!");
				System.exit(0);
			default:
				System.out.println("Invalid choice.please try again.\n");
			
			}
			
		}
		
	}	

}
