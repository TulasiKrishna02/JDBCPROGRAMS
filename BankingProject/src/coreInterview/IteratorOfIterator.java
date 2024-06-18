package coreInterview;

import java.util.Arrays;
import java.util.Iterator;

/*
 * Construct an iterator of iterator
 * 
 * Here is the below question format:
 * 
 * // E next(); // Boolean hasNext();
 * 
 * // input: Iterator<Iterator<E>> // output: Iterator<E>
 * 
 * // [[1], [2, 3]] => [1, 2, 3]
 */

public class IteratorOfIterator<E> implements Iterator<E> {

	private final Iterator<? extends Iterator<? extends E>> nested;
	private Iterator<? extends E> cur;

	public IteratorOfIterator(Iterator<? extends Iterator<? extends E>> nested) {
		this.nested = nested;
		cur = nested.next();
	}

	public static <E> Iterator<E> flattern(
			Iterator<? extends Iterator<? extends E>> nested) {
		return new IteratorOfIterator<E>(nested);
	}

	@Override
	public E next() {
		if (!hasNext()) {
			return null;
		}
		return cur.next();
	}

	@Override
	public boolean hasNext() {
		while (cur != null) {
			if (cur.hasNext()) {
				return true;
			}
			if (nested.hasNext()) {
				cur = nested.next();
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public void remove() {
		if (cur.hasNext()) {
			cur.remove();
		}
	}

	public static void main(String[] args) {
		Iterator<Integer> a = Arrays.asList(1, 2, 3).iterator();
		Iterator<Double> b = Arrays.asList(4.0, 5.0, 6.0).iterator();
		Iterator<Long> c = Arrays.asList(7L, 8L, 9L).iterator();
		Iterator<? extends Iterator<? extends Number>> list = Arrays.asList(a, b, c).iterator();

		Iterator<Number> itr = flattern(list);
		while (itr.hasNext()) {
			Number num = itr.next();
			System.out.println(num);
		}

	}
}