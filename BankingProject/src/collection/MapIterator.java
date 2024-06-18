package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterator {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		// initial a Map
		Map<String, String> mappp = new HashMap<String, String>();
		mappp.put("1", "Jan");
		mappp.put("2", "Feb");
		mappp.put("3", "Mar");
		mappp.put("4", "Apr");
		mappp.put("5", "May");
		mappp.put("6", "Jun");

		System.out.println("Example 1...");
		// Map -> Set -> Iterator -> Map.Entry -> troublesome
		Iterator iterator = mappp.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry mapEntry = (Map.Entry) iterator.next();
			System.out.println("The key is: " + mapEntry.getKey()
					+ ",value is :" + mapEntry.getValue());
		}

		System.out.println("Example 2...");
		// more elegant way
		for (Map.Entry<String, String> entry : mappp.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : "
					+ entry.getValue());
		}

		System.out.println("Example 3...");
		// weired way, but works anyway
		for (Object key : mappp.keySet()) {
			System.out.println("Key : " + key + " Value : "
					+ mappp.get(key));
		}

	}

}