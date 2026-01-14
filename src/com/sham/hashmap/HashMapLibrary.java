package com.sham.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapLibrary {
	public static void main(String[] args) {
		
		HashMap<String, Boolean> library = new HashMap<>();
        library.put("Core Java", true);
        library.put("Advanced Java", true);
        library.put("HTML", false);
        library.put("JavaScript", true);
        
        
        if (library.containsKey("Core Java") && library.get("Core Java")) {
			library.put("Core Java", false);
			System.out.println("Book is issued");
		}
        
        if (library.containsKey("HTML") && !library.get("HTML")) {
			library.put("HTML", true);
		}
        
//        library.forEach((K,V)->System.out.println(K+" : "+V));
        
        for (Entry<String, Boolean> entry : library.entrySet()) {
			String value=entry.getValue()?"available":"not availabel";
			
			System.out.println(entry.getKey()+"  "+value);
		}
	}
}
