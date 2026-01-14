package com.sham.hashmap.linkedhashmap;

import java.util.*;

public class LinkedHashSetDemo2 {
    public static void main(String[] args) {
//        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
//        linkedHashSet.add(10);
//        linkedHashSet.add(5);
//        linkedHashSet.add(15);
//        linkedHashSet.add(20);
//        linkedHashSet.add(5); // duplicate, won't be added
//
//        System.out.println("LinkedHashSet elements: " + linkedHashSet);
//        System.out.println("LinkedHashSet size: " + linkedHashSet.size());
//
//        int elementToCheck = 15;
//        if (linkedHashSet.contains(elementToCheck)) {
//            System.out.println(elementToCheck + " is present in the LinkedHashSet.");
//        } else {
//            System.out.println(elementToCheck + " is not present in the LinkedHashSet.");
//        }
//        
//        int remove=20;
//        
//        linkedHashSet.remove(remove);
//        System.out.println(linkedHashSet);
//        
//        
//        linkedHashSet.clear();
//        System.out.println(linkedHashSet);
    	
    	LinkedList<Integer> linkedList=new LinkedList<>();
    	
    	linkedList.add(6);
    	linkedList.add(5);
    	linkedList.add(4);
    	linkedList.add(3);
    	linkedList.add(2);
    	
    	System.out.println(linkedList);
    }
}
