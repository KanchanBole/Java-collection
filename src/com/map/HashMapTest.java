package com.map;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		hm.put("A", "A");
		hm.put(1, 1);
		hm.put(2, "PQR");
		hm.put("xyz", 3);
		hm.put(null, null);
		hm.put(5, 1);
		System.out.println(hm);

		/*
		 * Set keys = hm.keySet(); Iterator itr = keys.iterator(); while
		 * (itr.hasNext()){ Object key = itr.next(); Object value = hm.get(key);
		 * System.out.println(key + ":" + value); }
		 */

		Set keys = hm.keySet();
		for (Object key : keys) {
			Object value = hm.get(key);
			System.out.println(key + ":" + value);

		}

	}

}
