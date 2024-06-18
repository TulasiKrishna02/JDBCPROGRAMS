package dataStructure.stackLinkedList;

import java.util.LinkedList;

public class Stack<T> {

	LinkedList<T> list = new LinkedList<T>();

	public Stack() {
	}

	public void clear() {
		list.clear();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public T topEl(){
		if(isEmpty())
			throw new java.util.EmptyStackException();
		return list.getLast();
	}
	
	public T pop(){
		if(isEmpty())
			throw new java.util.EmptyStackException();
		return list.removeLast();
	}
	
	public void push(T e1){
		list.addLast(e1);
	}
	
	public String toString(){
		return list.toString();
	}
}
