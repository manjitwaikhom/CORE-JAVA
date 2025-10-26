package com.logics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

record Employee(int id,String name,String department,double salary){}


public class MostCommonFirstLetterJava8 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Joshua", "IT", 70000),
                new Employee(2, "Sally", "IT", 80000),
                new Employee(3, "Fiona", "IT", 90000),
                new Employee(4, "Watts", "HR", 60000),
                new Employee(5, "Joya", "HR", 65000),
                new Employee(6, "Chap", "HR", 70000),
                new Employee(7, "Roma", "Finance", 75000),
                new Employee(8, "Rahul", "Finance", 85000),
                new Employee(9, "Greiat", "Finance", 95000)
        );


        Optional<Map.Entry<Character, Long>> max = employees
                .stream()
                .map(e -> e.name()
                        .charAt(0))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue());
        ;

        System.out.println(max);
    }

}
