package com.simplilearn.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		
	hm.put(1, "Samsung");
	hm.put(2, "Nokia");
	hm.put(3, "apple");
	
	hm.remove(2, "Nokia");
	
	hm.put(2, "Oppo");
	
	Set<Entry<Integer, String>> data = hm.entrySet();
	Iterator<Entry<Integer, String>> itr = data.iterator();
	
	while (itr.hasNext()) {
		Map.Entry<Integer, String> entry =  itr.next();
		System.out.println(entry.getKey() +" "+entry.getValue());
				
		
	}
	
	}

}
