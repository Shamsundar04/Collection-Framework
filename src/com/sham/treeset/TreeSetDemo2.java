package com.sham.treeset;


import java.util.TreeSet;

// Employee record implementing Comparable
record Employee(Integer id, String name) implements Comparable<Employee> {

	@Override
	public int compareTo(Employee emp) {
		return this.id.compareTo(emp.id);
	}
   
}

public class TreeSetDemo2 {
    public static void main(String[] args) {
        // Create a TreeSet of Employee
        TreeSet<Employee> ts1 = new TreeSet<>();
        ts1.add(new Employee(333, "Scott"));
        ts1.add(new Employee(111, "Zuber"));
        ts1.add(new Employee(222, "Aryan"));
        
        System.out.println(ts1);
        
    }
}
