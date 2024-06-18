package comparator;

import java.util.TreeSet;

public class TreeSetUsingComparable {
	public static void main(String a[]) {
		Item i1 = new Item(1, "aa");
		Item i2 = new Item(5, "bb");
		Item i3 = new Item(10, "dd");
		Item i4 = new Item(41, "xx");
		Item i5 = new Item(3, "x5");
		TreeSet<Item> t = new TreeSet<Item>();
		t.add(i1);
		t.add(i2);
		t.add(i3);
		t.add(i4);
		t.add(i5);
		System.out.println(t);
	}
}

class Item implements Comparable<Item> {
	String nm;
	int price;

	public Item(int n, String nm) {
		this.nm = nm;
		price = n;
	}

	public int compareTo(Item i1) {
		// Objects equal so no need to add
		if (price == i1.price) {
			return 0;
		}
		// Object are greater
		else if (price > i1.price) {
			return 1;
		}
		// Object is lower
		else {
			return -1;
		}
	}

	public String toString() {
		return "\nPrice " + price + " Name : " + nm;
	}
}