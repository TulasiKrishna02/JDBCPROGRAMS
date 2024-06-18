package com.collections.www;

import java.util.Stack;

public class StackDemo {
	public static void main(String args[])
	{
		Stack s=new Stack();
		s.push("Tualsi");
		s.push("kamal");
		s.push("samantha");
		s.push("kajol");
	
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.search("Tualsi"));
		System.out.println(s.search("T"));

	}

}
