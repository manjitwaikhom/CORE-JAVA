package com.DSA.arrays;

import java.util.*;

public class RepeatedNumbers {
    public static void main(String[] args) {
        // Example array
        int[] arr = {1, 2, 3, 2, 4, 1, 5, 3, 2,2};

        // Method to find repeated numbers and their counts
        findRepeatedNumbers(arr);
    }

    public static void findRepeatedNumbers(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences of each number
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Print repeated numbers and their counts
        System.out.println("Repeated numbers and their counts:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
