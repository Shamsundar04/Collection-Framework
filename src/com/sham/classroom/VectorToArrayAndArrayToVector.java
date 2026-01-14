package com.sham.classroom;

import java.util.Vector;

public class VectorToArrayAndArrayToVector {
	public static void main(String[] args) {
		
//		Array To Vector
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		Vector<Integer> vector = new Vector<>();

		for (int i = 0; i < arr.length; i++) {
			vector.addElement(arr[i]);
		}
		
		
//		Vector To Array
		Object[] array = vector.toArray();
		
		for (Object object : array) {
			System.out.println(object);
		}

//		vector.sort((v1,v2)->v2.compareTo(v1));
//		vector.forEach(System.out::println);

//		vector.stream()
//			.filter(n -> n % 2 == 0)
//				.forEachOrdered(System.out::println);
	}
}
