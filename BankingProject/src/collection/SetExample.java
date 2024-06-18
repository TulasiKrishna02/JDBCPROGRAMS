package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet set1 = new HashSet();
		
		set1.add(null);
		set1.add(null);
		set1.add("hi");
		set1.add(1);
		set1.add("hii");
		set1.add(9);
		set1.add(10);
		set1.add("rohit");
		
		System.out.println("HashSet:"+ set1.toString());
		
		LinkedHashSet set = new LinkedHashSet();
		
		set.add(null);
		set.add(null);
		set.add("hi");
		set.add("rohit");
		set.add(1);
		set.add("hii");
		set.add(9);
		set.add(10);
		
		System.out.println("LinkedHashSet:"+ set.toString());
		
		TreeSet set2 = new TreeSet();
		
		set2.add("hi");
		//set2.add(null); //not allowed
		set2.add("rohit");
		set2.add("hii");
		set2.add("rohit3");
		set2.add("rohit2");
		set2.add("rohit1");
		
		System.out.println("TreeSet:"+ set2.toString());
	}
	

}
