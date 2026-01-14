package com.sham.hashmap;

import java.util.HashMap;
import java.util.Map;

public class GetOrDefaultMethod {

	public static void main(String[] args) {

		Map<String, Integer> nameCount = new HashMap<>();

		String[] names = { "sham", "rohit", "sham", "akash" };
		

		for (String name : names) {
			int count = nameCount.getOrDefault(name, 0);
			System.out.println(count);
			nameCount.put(name, count + 1);
		}

		System.out.println(nameCount);
	}
}
