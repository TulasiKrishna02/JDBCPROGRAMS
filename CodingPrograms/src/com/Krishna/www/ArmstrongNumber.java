package com.Krishna.www;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number");
int n=sc.nextInt();
int backup=n,sum=0;
while(n>0)
{
	sum=sum+(n%10)*(n%10)*(n%10);
	n=n/10;
}
if(backup==sum)
{
 System.out.println("It is a armstrong nmumber");	
}
else
{
System.out.println("it is not armstrong number");	
}

}
}
