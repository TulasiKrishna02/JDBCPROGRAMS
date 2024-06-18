package com.Array.www;

import java.util.Scanner;

public class Array1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		//inserting elements
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Eneter The Elements into The Arry:");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("The Elements in the Arry are:"+arr[i]);
		}
		
		
	}

}
