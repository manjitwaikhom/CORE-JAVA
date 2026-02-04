package com.DSA.sorting;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingMapBasedOnValues {
    public static void main(String[] args) {
        Map<String,Employee> employeesMap = new HashMap<>();
        employeesMap.put("robert", new Employee(1,"robert","java","male","healthcare"));
        employeesMap.put("singh", new Employee(2,"singh","react","male","finance"));
        employeesMap.put("robbie", new Employee(3,"robbie","python","female","insurance"));
        employeesMap.put("fiona", new Employee(4,"fiona","testing","female","supplychain"));

        //Employee object must implement Comparable
        LinkedHashMap<String,Employee> sortedEmployeesMap = employeesMap
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getId)))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));

        sortedEmployeesMap.entrySet().stream().forEach(e -> System.out.println(e));
    }
}
