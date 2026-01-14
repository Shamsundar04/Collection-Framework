package com.sham.classroom;

import java.util.Iterator;
//import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

record Products (Integer id, String name, Double price) {}

public class FailSafeIterator {
	public static void main(String[] args) {
		
		
		
		CopyOnWriteArrayList<Products> copy=new CopyOnWriteArrayList<>();
		copy.add(new Products(1, "camera", 30000d));
		copy.add(new Products(2, "mobile", 40000d));
		copy.add(new Products(3, "laptop", 23000d));
		
		
		Iterator<Products> iterator = copy.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			copy.add(new Products(4, "Sounds", 20000d));
		}
		
		
		
//		Vector<Products> copy=new Vector<>();
//		copy.add(new Products(1, "camera", 30000d));
//		copy.add(new Products(2, "mobile", 40000d));
//		copy.add(new Products(3, "laptop", 23000d));
//		
//		
//		Iterator<Products> iterator = copy.iterator();
//		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//			copy.add(new Products(4, "Sounds", 20000d));
//		}
	}
}
