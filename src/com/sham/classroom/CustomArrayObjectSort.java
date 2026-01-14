package com.sham.classroom;

//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.Vector;

record Product(Integer id, String name, Double price) {
}

public class CustomArrayObjectSort {

	public static void main(String[] args) {

		Vector<Product> vector = new Vector<>();
		vector.addElement(new Product(222, "Camera", 24000.0));
		vector.addElement(new Product(333, "Mobile", 30000.0));
		vector.addElement(new Product(111, "Television", 19000.0));

		vector.sort((c1, c2) -> c1.price().compareTo(c2.price()));
		vector.forEach(System.out::println);
//		Collections.sort(vector);

//		Product product[]= {
//				new Product(222, "Camera", 24000.0),
//				new Product(333, "Mobile", 30000.0),
//				new Product(111, "Television", 19000.0)
//		};
//		
//		Arrays.sort(product);
//		
//		for (Product product2 : product) {
//			System.out.println(product2);
//		}
	}
}
