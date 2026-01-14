package com.sham.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HashMapDemo {
    public static void main(String[] args) {
    	
    	/*
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Vanilla");
        map.put(2, "Butterscotch");
        map.put(3, "Chocolate");
        map.put(4, "Cotton Candy");
        
      
        // Using toString()
        System.out.println("By using toString() Method:");
        System.out.println(map);  // (key-value)
        
        // Using forEach()
        System.out.println("\nBy using forEach() method:");
        map.forEach((key, value) -> System.out.println(key + " -> " + value));

        // get()
        String value = map.get(2);
        System.out.println("\nValue for key 2: " + value);
        
        // getOrDefault()
        value = map.getOrDefault(9, "Key is not available");
        System.out.println("Value for key 3: " + value);

   
        // containsKey()
        boolean hasKey = map.containsKey(3);
        System.out.println("\nHashMap contains key 3: " + hasKey);
  
        // containsValue()
        boolean hasValue = map.containsValue("Vanilla");
        System.out.println("HashMap contains value 'Vanilla': " + hasValue);
        
        // remove()
        map.remove(1);
        System.out.println("\nHashMap after removing key 1: " + map);

        // Iterating using Iterator
        System.out.println("\nIterating through HashMap using Iterator:");
        Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
        
        while(iterator.hasNext()) {
        	Entry<Integer, String> next = iterator.next();
        	System.out.println(next.getKey()+"   "+next.getValue());
        }
        
   

        // forEachRemaining()
        System.out.println("\nIterating using forEachRemaining():");
        Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();

        itr.forEachRemaining(entry -> System.out.println(entry));
    
        // size()
        int size = map.size();
        System.out.println("\nSize of HashMap: " + size);

        // clear()
        map.clear();
        System.out.println("After clearing: " + map);
		*/    	
    	
    	HashMap<Integer, String> studentRecords = new HashMap<>();

        studentRecords.put(101, "Scott");
        studentRecords.put(102, "Smith");
        studentRecords.put(103, "Martin");
        studentRecords.put(104, "Aryan");
        
        System.out.println("Student Records: " + studentRecords);
        
        int searchId = 105;
        String studentName = studentRecords.get(searchId);
        
        
        Optional<String> optional = Optional.ofNullable(studentName);
        System.out.println(optional.orElse("Id is not available"));
     
        System.out.println(studentRecords.put(103, "Rahul"));
        System.out.println("Updated Records: " + studentRecords);

        studentRecords.remove(104);
        System.out.println("Records after removal: " + studentRecords);

        int idToCheck = 101;
        System.out.println("Does ID " + idToCheck + " exist? "
                + studentRecords.containsKey(idToCheck));
        
        String nameToCheck = "Aryan";
        System.out.println("Does name '" + nameToCheck + "' exist? "
                + studentRecords.containsValue(nameToCheck));

        System.out.println("Iterating through records:");
        for (Map.Entry<Integer, String> entry : studentRecords.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        studentRecords.clear();
        System.out.println("All records cleared: " + studentRecords); // {}
    }
}
