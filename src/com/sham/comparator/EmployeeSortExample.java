//package com.sham.comparator;
//
//import java.util.*;
//import java.util.stream.*;
//
//class Employee {
//    private int id;
//    private String name;
//    private String department;
//    private double salary;
//
//    public Employee(int id, String name, String department, double salary) {
//        this.id = id;
//        this.name = name;
//        this.department = department;
//        this.salary = salary;
//    }
//
//    public int getId() { return id; }
//    public String getName() { return name; }
//    public String getDepartment() { return department; }
//    public double getSalary() { return salary; }
//
//    @Override
//    public String toString() {
//        return String.format("%d - %s - %s - %.2f", id, name, department, salary);
//    }
//}
//
//public class EmployeeSortExample {
//    public static void main(String[] args) {
//        List<Employee> employees = Arrays.asList(
//            new Employee(101, "Sham", "IT", 60000),
//            new Employee(102, "Ravi", "HR", 55000),
//            new Employee(103, "Amit", "Finance", 75000),
//            new Employee(104, "Kiran", "IT", 75000),
//            new Employee(105, "Sanjay", "Finance", 75000)
//        );
//
//        // ✅ Sort by Department → Salary (desc) → Name
//        List<Employee> sortedList = employees.stream()
//            .sorted(Comparator
//                .comparing(Employee::getDepartment)
//                .thenComparing(Comparator.comparing(Employee::getSalary).reversed())
//                .thenComparing(Employee::getName))
//            .collect(Collectors.toList());
//
//        // Print sorted result
//        sortedList.forEach(System.out::println);
//    }
//}
