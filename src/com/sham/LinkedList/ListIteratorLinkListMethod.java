package com.sham.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorLinkListMethod {
	public static void main(String[] args) {
	
//        List<String> list = new ArrayList<>();
//        list.add("A"); // index 0
//        list.add("B"); // index 1
//        list.add("C"); // index 2
//
//        ListIterator<String> itr = list.listIterator();
//
//        System.out.println(itr.hasPrevious());  // false 
//        System.out.println(itr.hasNext()); // true
//        System.out.println("Initially -> previousIndex(): " + itr.previousIndex());
//        System.out.println("Initially -> nextIndex(): " + itr.nextIndex());
//        System.out.println("------------------------------------");
//
//        while (itr.hasNext()) {
//            String element = itr.next();
//            System.out.println("Current element: " + element);
//            System.out.println("Next index: " + itr.nextIndex());
//            System.out.println("Previous index: " + itr.previousIndex());
//            System.out.println("------------------------------------");
//        }
//
//        System.out.println("After traversing -> nextIndex(): " + itr.nextIndex());
//        System.out.println("After traversing -> previousIndex(): " + itr.previousIndex());

		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);

		ListIterator<Integer> itr = list.listIterator();

		try {

//        	System.out.println(itr.hasPrevious());

//    		System.out.println(itr.previousIndex());
//    		System.out.println(itr.nextIndex());
//    		System.out.println(itr.hasNext());
//    		itr.add(4);

			while (itr.hasNext()) {
				Integer next = itr.next();
				if (next == 1) {
					itr.set(0);
				}
			}

			itr.forEachRemaining(System.out::println);

		} catch (Exception e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}
}