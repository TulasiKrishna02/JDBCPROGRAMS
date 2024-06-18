package dataStructure.queueLinkedList;

import java.util.LinkedList;

public class Queue<T> {

	LinkedList<T> list = new LinkedList<T>();

	public Queue() {
	}

	public void clear() {
		list.clear();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public T firstEl(){
		if(isEmpty())
			throw new java.util.EmptyStackException();
		return list.getFirst();
	}
	
	public T dequeue(){
		if(isEmpty())
			throw new java.util.EmptyStackException();
		return list.removeFirst();
	}
	
	public void enqueue(T e1){
		list.addLast(e1);
	}
	
	public String toString(){
		return list.toString();
	}
}
