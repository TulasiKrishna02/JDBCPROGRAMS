package dataStructure.queueArray;

import java.util.Arrays;

public class Queue {
	public int first, last, size;
	public Object[] storage;

	public Queue() {
		this(100);
	}

	public Queue(int n) {
		size = n;
		storage = new Object[size];
		first = last = -1;
	}

	public boolean isFull() {
		return first == 0 && last == size - 1 || first == last + 1;
	}

	public boolean isEmpty() {
		return first == -1;
	}

	public void enqueue(Object e1) {
		if (!isFull()) {
			if ((last == size - 1 || last == -1)) {
				storage[0] = e1;
				last = 0;
				if (first == -1) {
					first = 0;
				}
			} else
				storage[++last] = e1;
		}
	}

	public Object dequeue() {
		if (!isEmpty()) {
			Object temp = storage[first];
			if (first == last)
				last = first = -1;
			else if (first == size - 1)
				first = 0;
			else{
				first++;
			}
			return temp;
		}
		return null;
	}

	public String toString() {
		return Arrays.toString(storage);
	}

}
