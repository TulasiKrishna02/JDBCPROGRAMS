package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class ArrayIterator {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String... aArguments) {
		List<String> flavours = new ArrayList<String>();
		flavours.add("chocolate");
		flavours.add("strawberry");
		flavours.add("vanilla");

		Iterator<String> itr = flavours.iterator();
		Iterator<String> itr1 = flavours.iterator();

		while (itr.hasNext()) {
			System.out.println("itr: "+itr.next());
			itr.remove();

		}
		System.out.println("---------");
		while (itr1.hasNext()) {
			System.out.println("itr1: "+itr1.next());
		}

		System.out.println("---------");
		List<Integer> li = new ArrayList<Integer>();
		ListIterator<Integer> litr = null;
		li.add(23);
		li.add(98);
		li.add(29);
		li.add(71);
		li.add(5);
		litr = li.listIterator();
		System.out.println("Elements in forward directiton");
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("Elements in backward directiton");
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

		ArrayList al = new ArrayList();
		// add elements to the array list
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		// use iterator to display contents of al
		System.out.println("Original contents of al: ");
		Iterator itrArr = al.iterator();
		while (itrArr.hasNext()) {
			String elem = (String) itrArr.next();
			if (elem == "E") {
				itrArr.remove(); // Removed element from Array with the help of Iterator, but we cant do it FOR loop
			}
			System.out.print(elem);
		}

		Iterator itrAfter = al.iterator();
		while (itrAfter.hasNext()) {
			System.out.println(itrAfter.next());
		}
	}
}
