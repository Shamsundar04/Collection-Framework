package com.sham.classroom;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

record Customer(Integer id, String name) {
}

public class EnumerationasIteratorMethod {
	public static void main(String[] args) {

		Vector<Customer> list = new Vector<>();

		list.add(new Customer(1, "ram"));
		list.add(new Customer(2, "ajay"));
		list.add(new Customer(3, "vijay"));
		
		
		Enumeration<Customer> elements = list.elements();
		Iterator<Customer> asIterator = elements.asIterator();		
		
		while(asIterator.hasNext()) {
			System.out.println(asIterator.next());
		}
	}
}
