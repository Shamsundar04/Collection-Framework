package com.sham.hashset.sortedsetmethod;

import java.util.*;

public class SortedSetMethods
{
    public static void main(String[] args)
    {
        TreeSet<Integer> times = new TreeSet<>();

        times.add(1205);
        times.add(1505);
        times.add(1545);
        times.add(1600);
        times.add(1830);
        times.add(2010);
        times.add(2100);
        
        for (Integer integer : times) {
			System.out.println(integer);
		}

        // Subset: from 1545 (inclusive) to 2100 (exclusive)
      /*  SortedSet<Integer> sub = times.subSet(1545, 2100);
        System.out.println("Using subSet() :- " + sub);

        System.out.println("First element in subset: " + sub.first());
        System.out.println("Last element in subset: " + sub.last());

        // headSet: elements < 1545
        sub = times.headSet(1545);
        System.out.println("Using headSet() :- " + sub);

        // tailSet: elements >= 1545
        sub = times.tailSet(1545);
        System.out.println("Using tailSet() :- " + sub);*/
         
        
//        1. Scheduling & Timetable Systems
//        Use case: You have events, flight schedules, or class timetables. You want to find events in a specific time range or upcoming events.
//        Example methods:
//        subSet() → get events between 10:00 AM and 3:00 PM
//        headSet() → get events before now
//        tailSet() → get upcoming events

//        TreeSet<Integer> meetingTimes = new TreeSet<>();
//        meetingTimes.add(900);  // 9:00 AM
//        meetingTimes.add(1130); // 11:30 AM
//        meetingTimes.add(1500); // 3:00 PM
//
////        SortedSet<Integer> morningMeetings = meetingTimes.headSet(1200); // before 12 PM
//        SortedSet<Integer> tailSet = meetingTimes.tailSet(1130);
//        System.out.println(tailSet);
        
        
        
        
        
        
//        2. Leaderboards & Ranking Systems
//        Use case: Games or competitions where you rank scores or filter top scores.
//        Example methods:
//        first() → lowest score
//        last() → highest score
//        tailSet() → scores above a threshold

        
//        TreeSet<Integer> scores = new TreeSet<>();
//        scores.add(1500);
//        scores.add(3000);
//        scores.add(2500);
//        int topScore = scores.last();
//        SortedSet<Integer> highScores = scores.tailSet(2500);
//        System.out.println(highScores);
        
        
//        3. Caching / Memory Management
//        Use case: In-memory cache (like LRU or TTL-based cache), you can quickly get expired items.
//        Example methods:
//        headSet(expiryTime) → remove old items
//        tailSet(currentTime) → keep active items

//        TreeSet<Long> cacheTimes = new TreeSet<>();
//        cacheTimes.add(System.currentTimeMillis() - 5000); // old
//        cacheTimes.add(System.currentTimeMillis() + 10000); // future//
//        SortedSet<Long> expired = cacheTimes.headSet(System.currentTimeMillis());
//        System.out.println(expired);
        
        
        
//        4. Stock/Trading Applications
//        Use case: Track price ranges, find stocks between two prices, or monitor highest/lowest.
//        Example methods:
//        subSet(minPrice, maxPrice) → get stocks in range
//        first() → lowest price
//        last() → highest price

//        TreeSet<Integer> stockPrices = new TreeSet<>();
//        stockPrices.add(100);
//        stockPrices.add(150);
//        stockPrices.add(200);
//
//        SortedSet<Integer> midRange = stockPrices.subSet(120, 300); 
//        System.out.println(midRange);
    }
}
