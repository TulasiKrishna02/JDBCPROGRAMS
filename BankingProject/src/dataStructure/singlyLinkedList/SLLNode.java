package dataStructure.singlyLinkedList;

public class SLLNode<T> {

	public T info;
	public SLLNode<T> next;

	public SLLNode() {
		next = null;
	}

	public SLLNode(T e1) {
		info = e1;
		next = null;
	}

	public SLLNode(T e1, SLLNode<T> ptr) {
		info = e1;
		next = ptr;
	}
}
