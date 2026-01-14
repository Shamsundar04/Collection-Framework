package com.sham.Arraylist;
import java.util.ArrayList;

class Solution {
	 // Function to get the count of elements between num1 and num2 in array arr.
	 public int getCount(ArrayList<Integer> arr, int num1, int num2) {
	     // Your Code goes here.
		 
		 int count=0;
		 
		 int firstIndex = arr.indexOf(num1);
		 int lastIndex = arr.indexOf(num2);
		 
		if (firstIndex != -1 && lastIndex != -1 && firstIndex<lastIndex) {
		
		}
	     return count;
	}
}

public class CountNumberOfElementsBetweenTwoGivenElements {
	public static void main(String[] args) {
		 Solution solution=new Solution();
	     int arr[] = {4, 2, 1, 10, 6};
	     ArrayList<Integer> list = new ArrayList<>();
	     for(int n:arr){
	         list.add(n);
	     }
	     System.out.println(solution.getCount(list,4,6));
	}
}