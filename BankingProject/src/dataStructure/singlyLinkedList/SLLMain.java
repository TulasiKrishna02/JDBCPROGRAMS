package dataStructure.singlyLinkedList;

public class SLLMain {

	public static void main(String[] args) {
		SLL<String> sll = new SLL<String>();
		sll.addToHead("3");
		sll.addToHead("2");
		sll.addToHead("1");
		sll.addToHead("head");
		sll.addToTail("5");
		sll.addToTail("tail");
		sll.insertAfter("3", "4");
		sll.delete("5");
		sll.printAll();
	}
}
