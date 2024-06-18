package dataStructure.doublyLinkedList;

public class DLLMain {

	public static void main(String[] args) {
		DLL<String> dll = new DLL<String>();
		dll.addToHead("5");
		dll.addToHead("4");
		dll.addToHead("3");
		dll.addToHead("2");
		dll.addToHead("1");
		dll.addToHead("head");
		dll.addToTail("tail");
		dll.insertAfter("1", "1a");
		dll.addToHead("tophead");
		dll.deleteFromHead();
		dll.insertAfter("5", "6");
		dll.insertAfter("tail", "tailfinal");
		dll.printAll();
	}
}
