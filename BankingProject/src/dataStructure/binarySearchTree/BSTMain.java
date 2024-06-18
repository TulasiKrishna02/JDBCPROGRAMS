package dataStructure.binarySearchTree;

public class BSTMain {

	public static void main(String[] args) {
		BST<Integer> bst = new BST<Integer>();
		bst.insert(15);
		bst.insert(10);
		bst.insert(5);
		bst.insert(12);
		bst.insert(18);
		bst.insert(16);
		bst.insert(20);
		bst.insert(19);
		bst.breadthFirst();
	}

}
