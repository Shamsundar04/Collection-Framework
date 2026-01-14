package com.sham.hashmap.identityhashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMap1 {
	public static void main(String[] args) {

		HashMap<String, Integer> hash = new HashMap<>();
		hash.put(new String("java"), 100);
		hash.put("java", 200);
		System.out.println("HashMap Size sis: " + hash.size());

		IdentityHashMap<String, Integer> ihm = new IdentityHashMap<>();
		ihm.put(new String("Java"), 1000);
		ihm.put("Java", 2000);
		System.out.println("IdentityHashMap Size is: " + ihm.size());
	}
}
