package com.list;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		ArrayList v = new ArrayList();

		v.add(10);
		v.add("abc");
		v.add(105d);
		v.add(105f);
		v.add(20);
		v.add("xyz");
		v.add(null);

		System.out.println(v);
		System.out.println(v.size());
		// System.out.println(v.capacity());
		System.out.println(v.contains(4));

	}

}
