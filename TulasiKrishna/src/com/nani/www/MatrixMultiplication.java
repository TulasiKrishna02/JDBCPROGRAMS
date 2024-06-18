package com.nani.www;

public class MatrixMultiplication {

	public static void main(String[] args) {

		int a[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int b[][]= {{4,4,4},{5,5,5},{6,6,6}};	
		int c[][]=new int[3][3];
		int i,j,k;
		System.out.println("Matrix A");
		System.out.println(a.length);
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
			
		}
		System.out.println("Matrix B");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Matrix Multiplication");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				c[i][j]=0;
				for(k=0;k<a.length;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
