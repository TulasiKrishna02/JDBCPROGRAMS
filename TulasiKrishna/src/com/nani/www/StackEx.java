package com.nani.www;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer>marks=new Stack<Integer>();
		
		//push am element
		
		marks.push(99);//7th
		marks.push(99);//6th
		marks.push(96);//5th
		marks.push(87);//4th
		marks.push(87);//3rd
		marks.push(95);//2nd
		marks.push(100);//1st positon top
		
		if(marks.empty())//it checks whether stack is empty or not
			System.out.println("stack is empty :");
		else
			System.out.println("Top element in the stack marks is :"+marks.peek());//return top value
		
		System.out.println("Element 99 position in the stack is"+marks.search(99));
		
		//it removes the top value from the stack
		marks.pop();
		
		System.out.println("Top element in the stack marks is :"+marks.peek());
		
		
		
		
	}

}
