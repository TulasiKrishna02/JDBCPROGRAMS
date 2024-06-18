package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String args[]) {

		// Create a hash map
		
		  //Hashtable ht = new Hashtable(); 
		  //ht.put("", null); 
		  //ht.put(null, "");
		  
		  TreeMap tree = new TreeMap();
		  tree.put("", null); 
		  tree.put(null, "");
		 

		HashMap hm = new HashMap();
		// Put elements to the map
		hm.put("Zara", new Double(3434.34));
		hm.put(null, new Double(3434.34));
		hm.put(null, new Double(34534334.34));
		hm.put("Mahnaz", new Double(123.22));
		hm.put("Ayan", new Double(1378.00));
		hm.put("Daisy", new Double(99.22));
		hm.put("Qadir", new Double(-19.08));

		hm.get("Zara");
		// Get a set of the entries
		Set set = hm.entrySet();
		// Get an iterator
		Iterator i = set.iterator();
		// Display elements
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();
		// Deposit 1000 into Zara's account
		double balance = ((Double) hm.get("Zara")).doubleValue();
		hm.put("Zara", new Double(balance + 1000));
		System.out.println("Zara's new balance: " + hm.get("Zara"));

		LinkedHashMap hm1 = new LinkedHashMap();
		// Put elements to the map
		hm1.put(null, new Double(3434.34));
		hm1.put(null, new Double(34534334.34));
		hm1.put("Mahnaz", new Double(123.22));
		hm1.put("Ayan", new Double(1378.00));
		hm1.put("Daisy", new Double(99.22));
		hm1.put("Qadir", new Double(-19.08));

		TreeMap tm = new TreeMap();
		// tm.put(null, "dfg");
		// tm.put(null, "dfg");
		tm.put("sdf", "dfg");
		System.out.println(tm);

	}
}