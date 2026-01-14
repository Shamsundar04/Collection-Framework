package com.sham.comparable;

import java.util.Arrays;
import java.util.Scanner;

record Employee(Integer id, String name, Double salary) implements Comparable<Employee>
{

	@Override
	public int compareTo(Employee e) {
		
		return this.id.compareTo(e.id);
	}	
}

public class ComparableExample {
	public static void main(String[] args) {
		
		System.out.print("Enter length ");
		Scanner scn=new Scanner(System.in);
		int len=scn.nextInt();
		
		Employee employee[]=new Employee[len];
		
		for(int i=0;i<len;i++) {
			
			Integer id=Integer.parseInt(scn.next());
			
			String name=scn.next();
			
			Double salary=scn.nextDouble();			
			employee[i]=new Employee(id, name, salary);
		}
		System.out.println(Arrays.toString(employee));
		Arrays.sort(employee);
		
		System.out.println(Arrays.toString(employee));
		
		scn.close();
	}
}
