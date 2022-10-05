package org.example.collections;

import java.time.ZonedDateTime;
import java.util.*;

public class Demo {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Hello");

        List<String> myList2 = new LinkedList<>();  // Linked list of type list
        Queue<String> myList3 = new LinkedList<>(); // Linked list of type queue
        Set<String> mySet = new TreeSet<>();
        Set<String> mySet2 = new LinkedHashSet<>();
        Set<String> mySet3 = new HashSet<>();

        Queue<String> myQueue = new PriorityQueue<>();

        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "One");
        myMap.put(2, "Two");
        myMap.put(3, "Three");
        System.out.println(myMap.get(1));   // Returns "One"
        System.out.println(myMap.get(4));   // Returns null
    }
}
