package com.Krishna.www;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*1.Given an Array of integers ,write a java program 
to find the second smallest element. 
int[] numbers={5,2,8,3,1};
****************************************
2.Given two arrays of integer,write a java8 program 
to find the common elements between them.
int[] arr1={1,2,3,4,5};
int[] arr2={4,5,6,7,8};
*******************************
3.Write a java8 program to reverse an array of Integers in place.
int[] numbers={1,2,3,4,5}; 
*/
public class Java8ArrayPrograms {
	public static void number(int arr[]) {
		
		int arr1=Arrays.stream(arr).distinct().sorted().skip(1).findFirst().orElseThrow(()->new IllegalArgumentException("Array does not have second smallest element:"));
		System.out.println(arr1);
	}
	public static void fetchCommonElements(int arr1[],int arr2[]) {
	List<Integer> commonElements=Arrays.stream(arr1).filter(number->Arrays.stream(arr2).anyMatch(arr2Number->arr2Number==number)).boxed().collect(Collectors.toList());
	System.out.println(commonElements);
	}
	public static void reverseGivenArrayInplace(int[] arr) {
		IntStream.range(0,arr.length/2 ).forEach(i->{
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		});
		System.out.println("Reversed Array:"+Arrays.toString(arr));
		
	}
	public static void main(String args[]) {
		int[] arr={5,2,8,3,1,1};
		number(arr);
		
		int[] arr1={1,2,3,4,5};
		int[] arr2={4,5,6,7,8};
		fetchCommonElements(arr1,arr2);
		
		int[] numbers={1,2,3,4,5};
		reverseGivenArrayInplace(numbers);
		}

}
