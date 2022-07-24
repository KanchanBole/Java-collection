package com.set;

import java.util.LinkedHashSet;

public class LHSTest {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(10);
		lhs.add("a");
		lhs.add(60);
		lhs.add(70);
		lhs.add("ABC");
		lhs.add("PQR");
		lhs.add(50);
		lhs.add(1);
		lhs.add(2);
		lhs.add("a");
		lhs.add("b");
		lhs.add(3);
		lhs.add(6);
		lhs.add(4);

		System.out.println(lhs);

	}

}
