package com.sham.hashmap.sortedmapmethods;

import java.util.*;

public class SortedMapMethods {
    public static void main(String[] args) {
    	
    	
//    	Method						Purpose
//    	firstKey()				Returns the smallest key
//    	lastKey()				Returns the largest key
//    	headMap(toKey)			Returns a map of keys less than toKey
//    	tailMap(fromKey)		Returns a map of keys greater than or equal to fromKey
//    	subMap(fromKey, toKey)	Returns a map of keys from fromKey (inclusive) to toKey (exclusive)
//    	comparator()			Returns the comparator used (null if natural ordering)
    	
    	
    	
    	
    	
    	
        TreeMap<Integer, String> scores = new TreeMap<>();

        scores.put(1500, "Alice");
        scores.put(3000, "Bob");
        scores.put(2, null);
        scores.put(2500, "Charlie");
        scores.put(1000, "Daisy");
        
        System.out.println(scores.firstKey());
        System.out.println();
        
        

		/*
		 * System.out.println("First key: " + scores.firstKey());
		 * System.out.println("Last key: " + scores.lastKey());
		 * 
		 * System.out.println("HeadMap (<2500): " + scores.headMap(2500));
		 * System.out.println("TailMap (>=2500): " + scores.tailMap(2500));
		 * System.out.println("SubMap (1500-3000): " + scores.subMap(1500, 3000));
		 */
    }
}

