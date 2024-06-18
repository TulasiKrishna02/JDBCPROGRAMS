package dataStructure.singlyLinkedList;

public class SLL<T> {
	protected SLLNode<T> head, tail;
	
	public SLL() {
		head = tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addToHead(T e1) {
		head = new SLLNode<T>(e1, head);
		if (tail == null)
			tail = head;
	}

	public void addToTail(T e1) {
		if (!isEmpty()) {
			tail.next = new SLLNode<T>(e1);
			tail = tail.next;
		} else
			head = tail = new SLLNode<T>(e1);
	}

	public T deleteFromHead() {
		if (isEmpty()) {
			return null;
		}
		T e1 = head.info;
		if (head == tail)
			head = tail = null;
		else {
			head = head.next;
		}
		return e1;
	}

	public T deleteFromTail() {
		if (isEmpty()) {
			return null;
		}
		T e1 = tail.info;
		if (head == tail)
			head = tail = null;
		else {
			SLLNode<T> tmp;
			for (tmp = head; tmp.next != tail; tmp = tmp.next);
				tail = tmp;
				tail.next = null;
		}
		return e1;
	}

	public void delete(T e1) {
		if (!isEmpty())
			if (head == tail && e1 == head.info)
				head = tail = null;
			else if (e1 == head.info) {
				head = head.next;
			} else {
				SLLNode<T> pred, tmp;
				for (pred = head, tmp = head.next; tmp != null && tmp.info != e1; pred = pred.next, tmp = tmp.next);
					if (tmp != null) {
						pred.next = tmp.next;
						if (tmp == tail) {
							tail = pred;
						}
					}
			}
	}
	
	public void insertAfter(T old, T e1) {
		if (!isEmpty())
			if (head == tail && old == head.info)
				addToTail(e1);
			else if (old == head.info) {
				SLLNode<T> tmp = new SLLNode<T>(e1);
				tmp.next = head.next;
				head.next = tmp;
			} else {
				SLLNode<T> pred;
				for (pred = head; pred.next != null && pred.info != old; pred = pred.next);
					if (pred.info == old || pred.next != null) {
						SLLNode<T> tmp = new SLLNode<T>(e1);
						tmp.next = pred.next;
						pred.next = tmp;
						if (tmp.next == null) {
							tail = tmp;
						}
					}
			}
	}

	public void printAll() {
		for (SLLNode<T> tmp = head; tmp != null; tmp = tmp.next) {
			System.out.print(tmp.info + " ");
		}
	}

	public boolean isInList(T e1) {
		SLLNode<T> tmp;
		for (tmp = head; tmp != null && tmp.info != e1; tmp = tmp.next);
		return tmp != null;
	}
}
