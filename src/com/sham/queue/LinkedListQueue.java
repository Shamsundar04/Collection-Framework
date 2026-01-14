package com.sham.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
	
	public static void main(String[] args) {
	
		Queue<String> queue = new LinkedList<>();
		queue.offer("A");
		queue.offer("B");
		System.out.println(queue.poll()); // A

		
	}

}
