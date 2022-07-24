package com.map;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class CHMTest {

	public static void main(String[] args) {

		ConcurrentHashMap hm = new ConcurrentHashMap();
		hm.put("A", "A");
		hm.put(1, 1);
		hm.put(2, "PQR");
		hm.put("xyz", 3);
		// hm.put(null, null);

		Set s = hm.keySet();
		for (Object keys : s) {
			hm.put("C", "block");
			System.out.println(keys);
		}

	}

}
