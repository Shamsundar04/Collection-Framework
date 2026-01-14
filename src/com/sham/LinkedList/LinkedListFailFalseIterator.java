package com.sham.LinkedList;

//ListIterator methods (add(), set(), remove())
import java.util.*;

public class LinkedListFailFalseIterator {
 public static void main(String[] args) {
     LinkedList<String> city = new LinkedList<>();
     city.add("Kolkata");
     city.add("Bangalore");
     city.add("Hyderabad");
     city.add("Pune");

     // Print original list
     System.out.println("Original List: " + city);

     // Create ListIterator
     ListIterator<String> lt = city.listIterator();

     while (lt.hasNext()) {
         String cityName = lt.next();

         if (cityName.equals("Kolkata")) {
             lt.remove(); // removes current element
         } 
         else if (cityName.equals("Hyderabad")) {
             lt.add("Ameerpet"); // adds new element after current one
         } 
         else if (cityName.equals("Pune")) {
             lt.set("Mumbai"); // replaces current element
         }
     }

     // Print modified list
     System.out.println("Modified List: " + city);

     // Print using forEach
     city.forEach(System.out::println);
 }
}

