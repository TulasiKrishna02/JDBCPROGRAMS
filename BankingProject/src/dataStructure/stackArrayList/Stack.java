package dataStructure.stackArrayList;

import java.util.ArrayList;

public class Stack<T> {

	ArrayList<T> pool = new ArrayList<T>();

	public Stack() {
	}

	public Stack(int n) {
		pool.ensureCapacity(n);
	}

	public void clear() {
		pool.clear();
	}

	public boolean isEmpty() {
		return pool.isEmpty();
	}
	
	public T topEl(){
		if(isEmpty())
			throw new java.util.EmptyStackException();
		return pool.get(pool.size() - 1);
	}
	
	public T pop(){
		if(isEmpty())
			throw new java.util.EmptyStackException();
		return pool.remove(pool.size() - 1);
	}
	
	public void push(T e1){
		pool.add(e1);
	}
	
	public String toString(){
		return pool.toString();
	}
}
