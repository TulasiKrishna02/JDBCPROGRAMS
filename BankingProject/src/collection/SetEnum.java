package collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.TreeSet;

public class SetEnum {
	public static void main(String args[]) {
		// create hash set

		TreeSet<String> newset2 = new TreeSet<String>();

		// populate hash set
		newset2.add("Learning");
		newset2.add("Easy");
		newset2.add("Simply");

		Enumeration<String> enm = Collections.enumeration(newset2);
		while (enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
	}
}