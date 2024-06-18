package dataStructure.queueLinkedList;

public class QueueMain {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Queue queue = new Queue();
		queue.enqueue("1");
		queue.enqueue("2");
		queue.enqueue("3");
		queue.enqueue("4");
		queue.enqueue("5");
		queue.enqueue("6");
		System.out.println(queue.toString());
		queue.dequeue();
		System.out.println(queue.toString());
		System.out.println(queue.dequeue());
		System.out.println(queue.toString());
	}

}
