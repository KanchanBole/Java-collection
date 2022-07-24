package com.queue;

import java.util.ArrayDeque;

public class ArrayDq {
	public static void main(String[] args) {

		ArrayDeque arrayDeque = new ArrayDeque();

		arrayDeque.add("2");
		arrayDeque.add(50);
		arrayDeque.add("abc");
		arrayDeque.addFirst("20");
		arrayDeque.addLast("pqr");

		System.out.println(arrayDeque);

		System.out.println(arrayDeque.element());
		System.out.println(arrayDeque.hashCode());

	}
}
