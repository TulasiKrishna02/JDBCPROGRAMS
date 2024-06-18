package dataStructure.binarySearchTree;

import java.util.Stack;

import dataStructure.queueLinkedList.Queue;

public class BST<T extends Comparable<T>> {

	public BSTNode<T> root = null;

	public BST() {
	}

	public void visit(BSTNode<T> p) {
		System.out.println(p.e1 + " ");
	}
	
	public void insert(T e1){
		BSTNode<T> p = root, prev = null;
		while (p != null) {
			prev = p;
			if (p.e1.compareTo(e1) < 0)
				p =p.right;
			else
				p =p.left;
		}
		if (root == null) {
			root = new BSTNode<T>(e1);
		} else if (prev.e1.compareTo(e1) < 0) {
			prev.right = new BSTNode<T>(e1);
		} else {
			prev.left = new BSTNode<T>(e1);
		}
	}

	public BSTNode<T> search(T e1) {
		BSTNode<T> p = root;
		while (p != null) {
			if (e1.equals(p.e1))
				return p;
			else if (e1.compareTo(p.e1) < 0)
				p = p.left;
			else
				p = p.right;
		}
		return null;
	}

	public void breadthFirst() {
		BSTNode<T> p = root;
		Queue<BSTNode<T>> queue = new Queue<BSTNode<T>>();
		if (p != null) {
			queue.enqueue(p);
			while (!queue.isEmpty()) {
				p = queue.dequeue();
				visit(p);
				if (p.left != null)
					queue.enqueue(p.left);
				if (p.right != null)
					queue.enqueue(p.right);
			}
		}
	}

	public void preorder() {
		// VLR -- parent/left/right
		preorder(root);
	}

	public void inorder() {
		// LVR -- left/parent/right
		inorder(root);
	}

	public void postorder() {
		// LRV -- left/right/parent
		postorder(root);
	}

	private void inorder(BSTNode<T> p) {
		if (p != null) {
			inorder(p.left);
			visit(p);
			inorder(p.right);
		}
	}

	private void preorder(BSTNode<T> p) {
		if (p != null) {
			visit(p);
			preorder(p.left);
			preorder(p.right);
		}
	}

	private void postorder(BSTNode<T> p) {
		if (p != null) {
			postorder(p.left);
			postorder(p.right);
			visit(p);
		}
	}

	public void iterativePreorder() {
		BSTNode<T> p = root;
		Stack<BSTNode<T>> travStack = new Stack<BSTNode<T>>();
		if (p != null) {
			travStack.push(p);
			while (!travStack.isEmpty()) {
				p = travStack.pop();
				visit(p);
				if (p.right != null)
					travStack.push(p.right);
				if (p.left != null)
					travStack.push(p.left);

			}
		}
	}

	public void iterativePostorder() {
		BSTNode<T> p = root, q = root;
		Stack<BSTNode<T>> travStack = new Stack<BSTNode<T>>();
		while (p != null) {
			for (; p.left != null; p = p.left) {
				travStack.push(p);
			}
			while (p != null && (p.right == null || p.right == q)) {
				visit(p);
				q = p;
				if (travStack.isEmpty())
					return;
				p = travStack.pop();

			}
			travStack.push(p);
			p = p.right;
		}
	}
}
