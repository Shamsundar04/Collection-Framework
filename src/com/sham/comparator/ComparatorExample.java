package com.sham.comparator;


record Employee(Integer id, String name) {}

public class ComparatorExample {
	public static void main(String[] args) {
		
		Employee []emp=new Employee[4];
		emp[0]=new Employee(2, "b");
		emp[1]=new Employee(1, "a");
		emp[2]=new Employee(5, "c");
		emp[3]=new Employee(3, "d");
//		Comparator<Employee> e=(e1,e2)->e1.name().compareTo(e2.name());
//		Arrays.sort(emp,e);
		
//		Comparator<Employee> e=(e1,e2)->e1.name().compareTo(e2.name());
//		Arrays.sort(emp, e);
//		System.out.println(Arrays.toString(emp));
//		
//		Comparator<Employee> e3=(e1,e2)->Integer.compare(e1.id(), e2.id());
//		Arrays.sort(emp,e3);
////		Arrays.sort(emp, (e1,e2)->Integer.compare(e1.id(), e2.id()));
//		System.out.println(Arrays.toString(emp));
		
		
	}
}
