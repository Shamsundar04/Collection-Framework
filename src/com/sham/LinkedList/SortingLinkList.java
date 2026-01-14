package com.sham.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

record Product(Integer id, String name) implements Comparable<Product> {

	@Override
	public int compareTo(Product o) {
		return this.id().compareTo(o.id());
	}
}

public class SortingLinkList {
	public static void main(String[] args) {
		
		LinkedList<Product> list = new LinkedList<>();

		list.add(new Product(2, "Mobile"));
		list.add(new Product(1, "camera"));
		list.add(new Product(3, "teleivison"));

//		list.sort((p1, p2) ->p1.id().compareTo(p2.id()) );

		Collections.sort(list);
		System.out.println(list);
	}
}
