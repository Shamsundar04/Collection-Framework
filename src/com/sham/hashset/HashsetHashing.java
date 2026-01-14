package com.sham.hashset;

import java.util.HashSet;

public class HashsetHashing {
	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<>();

		set.add(67);  //  67%16=3
		set.add(89);
		set.add(33);
		set.add(null);
		set.add(45);
		set.add(12);
		set.add(35);
		
		set.forEach(System.out::println);

		System.out.println("A".hashCode());
	}
}