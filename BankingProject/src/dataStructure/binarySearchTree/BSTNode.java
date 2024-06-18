package dataStructure.binarySearchTree;

public class BSTNode<T extends Comparable<T>> {

	public T e1;
	public BSTNode<T> left, right;

	public BSTNode() {
		left = right = null;
	}

	public BSTNode(T e1) {
		this(e1, null, null);
	}

	public BSTNode(T e1, BSTNode<T> lt, BSTNode<T> rt) {
		this.e1 = e1;
		left = lt;
		right = rt;
	}

}
