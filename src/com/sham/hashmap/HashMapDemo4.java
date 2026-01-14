package com.sham.hashmap;

import java.util.HashMap;

//Using Java 16+ records
record Employee(Integer empId, String empName) {
}

public class HashMapDemo4 {
 public static void main(String[] args) {
     // Creating Employee objects
     Employee e1 = new Employee(101, "Aryan");
     Employee e2 = new Employee(102, "Pooja");
     Employee e3 = new Employee(101, "Aryan"); // Same data as e1
     Employee e4 = e2; // Reference copy

     // Creating HashMap with Employee as key
     HashMap<Employee, String> hm = new HashMap<>();
     hm.put(e1, "Ameerpet");
     hm.put(e2, "S.R Nagar");
     hm.put(e3, "Begumpet"); // e3 equals e1
     hm.put(e4, "Panjagutta"); // e4 equals e2

     // Printing map
     hm.forEach((k, v) -> System.out.println(k + " -> " + v));
 }
}
