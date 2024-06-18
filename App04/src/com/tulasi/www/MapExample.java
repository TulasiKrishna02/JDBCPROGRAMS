package com.tulasi.www;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
     @SuppressWarnings({"unchecked","rawtypes"})
	public static void main(String[] args) {
		
		
		/*TreeMap tree =new TreeMap();
		tree.put("",null);
		tree.put(null,"");*/
		
		
		HashMap hm=new HashMap();
		hm.put("zara",new Double(3434.34));
		hm.put(null,new Double(3434.34));
		hm.put(null, new Double(34534334.22));
		hm.put("mahnaz", new Double(123.12));
		hm.put("Ayan",new Double(1378.00));
		hm.put("Daisy",new Double(99.22));
		hm.put("Qadir", new Double(-19.08));
		hm.get("zara");
		
		
		Set set= hm.entrySet();
		
		Iterator i=set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me=(Map.Entry) i.next();
			System.out.println(me.getKey()+":"+me.getValue());
			//System.out.println(me.getValue());
			
		}
		System.out.println();
		//Deposit 1000 into zaras
		double balance=((Double)hm.get("zara")).doubleValue();
		hm.put("zara", new Double(balance+1000));
		System.out.println("zara's new balance:"+hm.get("zara"));
		
		LinkedHashMap hml=new LinkedHashMap();
		
		//put elements into the map
		
		hml.put(null, new Double(3434.34));
		hml.put(null, new Double(34534334.34));
		hml.put("mahnaz", new Double(123.22));
		hml.put("Ayan",new Double(1378.00));
		hml.put("Daisy", new Double(99.22));
		hml.put("Qadir",new Double(-19.08));
		System.out.println(hml);
		
		TreeMap tm=new TreeMap();
		//tm.put(null, "dfg");
		//tm.put("sdf","dfg");
		tm.put("sdf", "dfg");
		System.out.println(tm);

	}

}
