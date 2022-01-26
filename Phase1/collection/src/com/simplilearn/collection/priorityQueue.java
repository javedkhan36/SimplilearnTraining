package com.simplilearn.collection;

import java.util.PriorityQueue;

public class priorityQueue {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		
		pq.add("tank");
		pq.add("fuel");
		pq.add("handle");
		pq.add("seat");
		pq.add("indicator");
		
		for (String value : pq) {
			System.out.println(value);
		}
		System.out.println();
		
		System.out.println(pq.poll());
		
		
		System.out.println(pq.peek());
		
		


	}

}
