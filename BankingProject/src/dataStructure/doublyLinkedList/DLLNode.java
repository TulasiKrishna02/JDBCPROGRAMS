package dataStructure.doublyLinkedList;

public class DLLNode<T> {

	public T info;
	public DLLNode<T> next, prev;

	public DLLNode() {
		next = null;
		prev = null;
	}

	public DLLNode(T e1) {
		info = e1;
		next= null;
		prev= null;
	}
	
	public DLLNode(T e1,DLLNode<T> n,DLLNode<T> p) {
		info = e1;
		next= n;
		prev= p;
	}
}
