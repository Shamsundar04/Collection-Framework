package com.sham.hashmap.linkedhashmap;

import java.util.*;

public class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Ravi");
        lhs.add("Vijay");
        lhs.add("Ravi"); // duplicate, won't be added
        lhs.add("Ajay");
        lhs.add("Pawan");
        lhs.add("Shiva");
        lhs.add(null); // LinkedHashSet allows one null
        lhs.add("Ganesh");

        // Print all elements
        lhs.forEach(str -> System.out.println(str));
    }
}
