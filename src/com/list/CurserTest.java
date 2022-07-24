package com.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CurserTest {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.add(50);
		v.add(60);
		v.add("abc");
		v.add("pqr");

		Iterator itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("------------------------------------");

		ListIterator itr1 = v.listIterator();
		itr1.add(100);
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		System.out.println("------------------------------------");

		while (itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}

		for (Object object : v)
			System.out.println(object);

	}

}
