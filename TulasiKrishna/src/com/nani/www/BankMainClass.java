package com.nani.www;

import java.util.*;
class Balance
{
public double bal=2000;
double getBalance()
{
return bal;
}
}

class CheckPinNo
{
	boolean verify(int pinNo)
	{
	return switch(pinNo)
	{
	case 1111: yield true;
	case 2222: yield true;
	case 3333: yield true;
	default:yield false;
	};
	}
}


interface Transaction
{
public static final Balance b=new Balance();
public abstract void process(int amt);
}
class Deposit implements Transaction
{
public void process(int amt)
{
System.out.println("Amount Deposited:"+amt);
b.bal=b.bal+amt;
System.out.println("Balance Amount:"+b.getBalance());
System.out.println("Transaction completed..");
}
}
class WithDraw implements Transaction
{
public void process(int amt)
{
	if(amt<=b.bal){
	System.out.println("Amount Withdrawn:"+amt);
	b.bal=b.bal-amt;
	System.out.println("Balance Amount:"+b.getBalance());
	System.out.println("Transaction completed..");
	}
	else
	{
	System.out.println("insufficient funds");
	}
}
}

class BankMainClass
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int count=0;
pqr:
while(true)
{
System.out.println("Enter pin number");
int pinNo=sc.nextInt();
if(pinNo>=1000 && pinNo<=9999)
{
CheckPinNo cpn=new CheckPinNo();
boolean k=cpn.verify(pinNo);
if(k)
{
System.out.println("Choice");
System.out.println("1.withdraw\n2.Deposit");
System.out.println("Enter your choice");
int ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter the amount");
int a=sc.nextInt();
if(a>0 && a%100==0)
{
WithDraw wd=new WithDraw();
wd.process(a);
}
else
{
System.out.println("Invalid Amount");
}
break pqr;
case 2:
System.out.println("Enter the amount");
int a1=sc.nextInt();
if(a1>0 && a1%100==0)
{
Deposit d=new Deposit();
d.process(a1);
}
else
{
System.out.println("Invalid Amount");
}
break pqr;

default:
System.out.println("Invalid choice");
break pqr;
}//end of switch
}
else
{
System.out.println("Invalid pin number");
count++;
}
}
else
{
System.out.println("Invalid pin number");
count++;
}
if(count==3)
{
System.out.println("Transaction blocked");
break;
}
}//end of the loop

}

}

