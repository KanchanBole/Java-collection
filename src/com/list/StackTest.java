package com.list;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {

		Stack stack = new Stack();
		stack.add(10);
		stack.add("abc");
		stack.add("abc");
		stack.add(20);
		stack.add(null);

		System.out.println(stack);
		System.out.println(stack.add(30));
		System.out.println(stack.firstElement());
		System.out.println(stack.capacity());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
	}

}
