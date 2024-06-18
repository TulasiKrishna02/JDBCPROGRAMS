package collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetIterator {
	public static void main(String args[]) {
		// create hash set

		LinkedHashSet<String> newset = new LinkedHashSet<String>();

		// populate hash set
		newset.add("Learning");
		newset.add("Easy");
		newset.add("Simply");

		// create an iterator
		Iterator iterator = newset.iterator();

		// check values
		while (iterator.hasNext()) {
			System.out.println("Value: " + iterator.next() + " ");
		}

		HashSet<String> newset1 = new HashSet<String>();

		// populate hash set
		newset1.add("Learning");
		newset1.add("Easy");
		newset1.add("Simply");

		// create an iterator
		Iterator iterator1 = newset1.iterator();

		// check values
		while (iterator1.hasNext()) {
			System.out.println("Value: " + iterator1.next() + " ");
		}

		TreeSet<String> newset2 = new TreeSet<String>();

		// populate hash set
		newset2.add("Learning");
		newset2.add("Easy");
		newset2.add("Simply");

		// create an iterator
		Iterator iterator2 = newset2.iterator();

		// check values
		while (iterator2.hasNext()) {
			System.out.println("Value: " + iterator2.next() + " ");
		}

		for (String str : newset2) {
			System.out.println(str);
		}

		Enumeration<String> enm = Collections.enumeration(newset2);
		while (enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
	}
}