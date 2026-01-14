package com.sham.hashmap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo3 {
    public static void main(String[] args) {
        // Creating two HashMaps
        HashMap<Integer, String> newMap1 = new HashMap<>();
        HashMap<Integer, String> newMap2 = new HashMap<>();

        // Adding values to newMap1
        newMap1.put(1, "OCPJP");
        newMap1.put(2, "is");
        newMap1.put(3, "best");

        System.out.println("Values in newMap1: " + newMap1);

        // Adding values to newMap2
        newMap2.put(4, "Exam");
        newMap2.putAll(newMap1); // Merging newMap1 into newMap2

        System.out.println("Iterating through forEach():");
        newMap2.forEach((k, v) -> System.out.println(k + ":" + v));

        // Getting all unique keys
        Set<Integer> setOfKeys = newMap2.keySet();
        System.out.println("All the unique keys: " + setOfKeys);

        // Getting all values
        Collection<String> values = newMap2.values();
        System.out.println("All the values: " + values);

        System.out.println("\nLoose Coupling for Merging one Map to another:");

        // Another example of HashMap merging
        HashMap<Integer, String> hm1 = new HashMap<>();
        hm1.put(1, "Ravi");
        hm1.put(2, "Rahul");
        hm1.put(3, "Rajen");

        // Creating hm2 by copying hm1
        HashMap<Integer, String> hm2 = new HashMap<>(hm1);

        System.out.println("Mapping of HashMap hm1: " + hm1);
        System.out.println("Mapping of HashMap hm2: " + hm2);
    }
}