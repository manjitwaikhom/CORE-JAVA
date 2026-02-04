package com.DSA;


import java.util.*;
import java.util.stream.Collectors;

record Employee(int id,String name,String department, double salary){}

public class SecondHighestSalaryInDepertment {
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


        Map<String, List<Employee>> groupedByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::department));


        groupedByDept.forEach((k, v) -> {
                    List<Double> d=v.stream()

                            .sorted(Comparator.comparingDouble(Employee::salary))
                            .map(Employee::salary).distinct()
                            .collect(Collectors.toList());
            System.out.println(k);
            System.out.println(d.get(1).doubleValue());

                }


        );

    }


}

