package com.collections.www;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortDemo {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);

	}

}
