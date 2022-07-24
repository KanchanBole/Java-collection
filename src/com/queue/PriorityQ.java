package com.queue;

import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {

		PriorityQueue pq = new PriorityQueue();

		pq.add(101);
		pq.add(103);
		pq.add(105);
		pq.add(107);
		pq.offer(106);
		pq.offer(105);

		System.out.println(pq);
		System.out.println(pq.peek());

	}

}
