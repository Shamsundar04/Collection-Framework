package com.sham.Arraylist;

import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListSortingAndIterationForwardBackward {
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("eshwari","deepak", "chaitanya", "balaji", "ajay");
		
//		Collections.sort(asList);
//		System.out.println(asList);
		
//		Comparator<String> comparator=(name1,name2)->name1.compareTo(name2);
//		asList.sort(comparator);

//		asList.sort((name1,name2)->name1.compareTo(name2));
//		asList.forEach(System.out::println);
		
		
		asList.sort((name1,name2)->name1.compareTo(name2));
		
		ListIterator<String> listIterator = asList.listIterator();
		
		System.out.println("Forward direction");
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("\nBackward direction");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
	}
}