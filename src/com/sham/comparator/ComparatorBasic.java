package com.sham.comparator;

import java.util.*;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class AgeComparator implements Comparator<Person> {
	public int compare(Person p1, Person p2) {
		return p1.age - p2.age;
	}
}

public class ComparatorBasic {
	public static void main(String[] args) {
		List<Person> list = Arrays.asList(
				new Person("Sham", 25),
				new Person("Ravi", 20),
				new Person("Amit", 20));

		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);

		List<Integer> list3 = new ArrayList<>();
		list3.add(2);
		list3.add(1);

		boolean containsAll = list3.containsAll(list2);

		System.out.println(containsAll);

//        Collections.sort(list, new AgeComparator());

		list.sort((s1, s2) -> s1.age - s2.age);

//        list.sort((s1,s2)->{
//        	
//        	if (s1.age==s2.age) {
//				return s1.name.compareTo(s2.name);
//			}
//        	else {
//				return Integer.compare(s1.age, s2.age);
//			}
//        });

		list.sort(Comparator.comparingInt((Person p) -> p.age).thenComparing(p -> p.name));

		for (Person p : list) {
			System.out.println(p.name + " - " + p.age);
		}
	}
}
