package com.set;

import java.util.HashSet;

public class HSTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hashSet = new HashSet();
		hashSet.add(10);
		hashSet.add("k");
		hashSet.add(null);
		hashSet.add("a");
		hashSet.add(20);
		hashSet.add("c");
		hashSet.add(null);
		hashSet.add("b");
		hashSet.add(50);
		hashSet.add("h");
		hashSet.add(6);
		hashSet.add("e");
		hashSet.add(50);
		hashSet.add(11);

		System.out.println(hashSet);
		System.out.println(hashSet.size());
		System.out.println(hashSet.hashCode());

	}

}
