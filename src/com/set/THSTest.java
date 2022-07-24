package com.set;

import java.util.Iterator;
import java.util.TreeSet;

public class THSTest {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();
		ts.add(1);
		ts.add(3);
		ts.add(3);
		ts.add(0);
		ts.add(6);
		ts.add(4);

		System.out.println(ts);

		Iterator itr = ts.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			System.out.println(i);
		}

		System.out.println("---------------------------");

		System.out.println("descending :");
		Iterator itr1 = ts.descendingIterator();
		while (itr1.hasNext()) {
			Integer i = (Integer) itr1.next();
			System.out.println(i);
		}

	}

}
