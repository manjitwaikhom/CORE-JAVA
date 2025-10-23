package com.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingArrayListUsingStreams {
    public static void main(String[] args) {
        List<Integer> toBeSorted = Arrays.asList(1,3,4,5,6,2,3);
        List<Integer> sorted = toBeSorted.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(sorted);
    }
}
