package com.nani.www;

public class NumberSorting {

	public static void main(String[] args) {

		int number[]={55,40,80,71,1,26,2,4};
		int n=number.length;
		System.out.println("Given list:");
			for(int i=0;i<n;i++)
			{
			System.out.print(" "+number[i]);
			
			System.out.println("/n");
				for(int j=i+1;j<n;j++)
				{
					if(number[i]>number[j])
					{
						int temp=number[i];
						number[i]=number[j];
						number[j]=temp;
					}


				}


			}
			System.out.println("Sorted list:"+n);
			for(int i=0;i<n;i++)
			{

			System.out.println(" "+number[i]);
			}
			//System.out.println("");


	
		
		
		
		
	}

}
