package com.sham.treeset;

import java.util.TreeSet;

// Student record
record Student(Integer id, String name) {}

public class TreeSetSortComparator {
    public static void main(String[] args) {
        // TreeSet with custom comparator to sort by name
    	TreeSet<Student> ts1=new TreeSet<>((t1,t2)->t1.name().compareTo(t2.name()));

        // Add students
        ts1.add(new Student(333, "Scott"));
        ts1.add(new Student(111, "Zuber"));
        ts1.add(new Student(222, "Aryan"));

        // Print all elements
        ts1.forEach(System.out::println);
    }
}
