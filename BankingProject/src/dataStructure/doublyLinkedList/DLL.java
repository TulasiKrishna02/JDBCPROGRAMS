package dataStructure.doublyLinkedList;


public class DLL<T> {
	protected DLLNode<T> head, tail;

	public DLL() {
		head = tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void setToNull() {
		head = tail = null;
	}

	public T firstEl() {
		if (head != null)
			return head.info;
		else
			return null;
	}

	public void addToHead(T e1) {
		if (head != null) {
			head = new DLLNode<T>(e1, head, null);
			head.next.prev = head;
		} else
			head = tail = new DLLNode<T>(e1);
	}

	public void addToTail(T e1) {
		if (tail != null) {
			tail = new DLLNode<T>(e1, null, tail);
			tail.prev.next = tail;
		} else
			head = tail = new DLLNode<T>(e1);
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
			head.prev = null;
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
			tail = tail.prev;
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
				head.prev = null;
			} else {
				DLLNode<T> pred, tmp;
				for (pred = head, tmp = head.next; tmp != null
						&& tmp.info != e1; pred = pred.next, tmp = tmp.next)
					;
				if (tmp != null) {
					pred.next = tmp.next;
					tmp.next.prev = pred;
					if (tmp == tail) {
						tail = pred;
						tail.next = null;
					}
				}
			}
	}

	public void insertAfter(T old, T e1) {
		if (!isEmpty())
			if (head == tail && old == head.info)
				addToTail(e1);
			else if (old == head.info) {
				DLLNode<T> tmp = new DLLNode<T>(e1);
				tmp.next = head.next;
				head.next = tmp;
				tmp.next.prev = tmp;
				tmp.prev = head;
			} else {
				DLLNode<T> pred;
				for (pred = head; pred.next != null && pred.info != old; pred = pred.next);
				if (pred.info == old || pred.next != null) {
					DLLNode<T> tmp = new DLLNode<T>(e1);
					if (pred.next != null) {
						tmp.next = pred.next;
						pred.next = tmp;
						tmp.next.prev = tmp;
						tmp.prev = pred;
					}
					else{
						tmp.next = null;
						pred.next = tmp;
						tmp.prev = pred;
						tail = tmp;
					}
				}
			}
	}

	public void printAll() {
		for (DLLNode<T> tmp = head; tmp != null; tmp = tmp.next) {
			System.out.println(tmp.info + " ");
		}
	}

	public T find(T e1) {
		DLLNode<T> tmp;
		for (tmp = head; tmp != null && tmp.info != e1; tmp = tmp.next)
			;
		if (tmp == null)
			return null;
		else
			return tmp.info;
	}
}
