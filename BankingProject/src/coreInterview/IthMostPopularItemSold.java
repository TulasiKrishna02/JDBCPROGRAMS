package coreInterview;

import java.util.*;

/*Implement a function that returns the i-th most popular item sold 
 at xyz company. You cannot rely on any libraries. 

 Class Item { 
 String itemId; 
 int quantitySold; 
 } 


 *//**
 * find the i-th most popular item in the list
 **/
/*
 * String find(List<Item> items, int i) { // your code goes here }
 */

public class IthMostPopularItemSold {

	public int privateid;
	public int quantity_sold;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		HashMap<String, Integer> r = new HashMap<String, Integer>();
		r.put("Iphone", 100);
		r.put("Samsung", 80);
		r.put("Blackberry", 90);
		r.put("Windows", 60);
		r.put("Micromax", 44);
		r.put("Nokia", 56);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the ith popular element");
		int i = sc.nextInt();
		find_popular(r, i);
	}

	public static void find_popular(HashMap<String, Integer> r, int i) {
		int count = 0;

		Map r1 = SortedByValues(r);
		Set s = r1.entrySet();
		Iterator it2 = s.iterator();
		
		//Iterator it2 = r1.entrySet().iterator();
		while (it2.hasNext()) {
			Map.Entry r2 = (Map.Entry) (it2.next());

			count = count + 1;
			if (i <= r1.size()) {
				if (count == i) {
					System.out.println(i + "th popular element is " + r2.getKey() + "Number of items sold is:" + r2.getValue());
				}
			} else {
				System.out.println("Invalid count!!!Try again!");
				System.exit(0);
			}
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static HashMap SortedByValues(HashMap r) {

		List l = new LinkedList(r.entrySet());
		Collections.sort(l, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o2)).getValue()).compareTo(((Map.Entry) (o1)).getValue());
			}
		});

		HashMap mp = new LinkedHashMap();
		Iterator it = l.iterator();
		while (it.hasNext()) {
			Map.Entry r1 = (Map.Entry) it.next();
			mp.put(r1.getKey(), r1.getValue());
		}
		return mp;
	}

}