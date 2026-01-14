package com.sham.LinkedList;

public class LinkedListDemo {

	private static class Node {
		int item;
		Node next;

		public Node(int item) {
			this.item = item;
			this.next = null;
		}
	}

	public static void main(String[] args) {

		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);

		n1.next = n2;
		n2.next = n3;

		System.out.println(n1.item);
		System.out.println(n1.next.item);
		System.out.println(n1.next.next.item);
	}
}