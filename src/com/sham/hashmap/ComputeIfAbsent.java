package com.sham.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class ComputeIfAbsent {
	public static void main(String[] args) {

		String text = "java python java html java";

		String[] split = text.split(" ");

		HashMap<String, Integer> map = new HashMap<>();

		for(String word : split) {
			map.computeIfAbsent(word, v->0);
			map.put(word, map.get(word)+1);
		}

		map.forEach((k,b)->System.out.println(k+" "+b));
//		Map<String, Integer> map = new HashMap<>();
//		map.computeIfAbsent ("A", key -> key.length());
//		Integer computeIfAbsent = map.computeIfAbsent("A", key -> 100);
//		map.computeIfAbsent("B", key -> 200);
//		map.computeIfAbsent("C", key -> null);
//		map.computeIfAbsent (null, key -> 400);
//		System.out.println(map);
	}
}
