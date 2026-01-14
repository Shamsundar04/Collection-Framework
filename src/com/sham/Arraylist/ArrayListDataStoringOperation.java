package com.sham.Arraylist;

import java.util.ArrayList;

public class ArrayListDataStoringOperation {

	public static void main(String[] args) {

		ArrayList<Object> aList=new ArrayList<>();
		
		aList.add(12);
		aList.add("Ravi");
		aList.add(12);
		aList.add(3, "Hyderabad");
		aList.add(1, "Naresh");
		aList.add(null);
		aList.add(11);
		System.out.println(aList);
//		[12, Naresh, Ravi, 12, Hyderabad, null, 11]
	}
}
