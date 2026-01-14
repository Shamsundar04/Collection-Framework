package com.sham.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class TimeDifferenceArrayListLinkedList {
	public static void main(String[] args) {

		final int iteration = 100000;

		long startTime = System.currentTimeMillis();

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < iteration; i++) {

			list.add(0, i);
		}

		long endTime = System.currentTimeMillis();
		System.out.println("Time taken by ArrayList() " + (endTime - startTime));
		
		

		startTime = System.currentTimeMillis();

		LinkedList<Integer> linkedList = new LinkedList<>();
		for (int i = 0; i < iteration; i++) {
			linkedList.add(0, i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Time taken by LinkedList() " + (endTime - startTime));
	}
}
