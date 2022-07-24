package com.map;

import java.util.Enumeration;
import java.util.Hashtable;

public class HTTest {

	public static void main(String[] args) {

		Hashtable ht = new Hashtable();
		ht.put("a", 1);
		ht.put("b", 2);
		ht.put("c", 3);
		// ht.put(null,null); not allow

		System.out.println(ht);

		Enumeration e = ht.elements();
		while (e.hasMoreElements()) {
			Integer keys = (Integer) e.nextElement();
			System.out.println(keys);
		}

	}

}
