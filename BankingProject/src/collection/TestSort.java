package collection;

import java.util.ArrayList;
import java.util.Collections;

class TestSort {
	public static void main(String[] args) {
		ArrayList<String> stuff = new ArrayList<String>(); // #1
		stuff.add("Denver");
		stuff.add("Boulder");
		stuff.add("Vail");
		stuff.add("Aspen");
		stuff.add("Telluride");
		System.out.println("unsorted " + stuff);
		Collections.sort(stuff); // #2
		System.out.println("sorted " + stuff);
	}
}