package com.convertListToMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {


        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1,"Manjit"));
        empList.add(new Employee(2,"Singh"));
        empList.add(new Employee(3,"Waikhom"));

        //using stream
        /*Map<Integer,Employee> map = empList.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
        System.out.println(map);*/

        Map<String,Employee> map = new HashMap<>();
        empList.forEach(e->map.put(e.getName(),e));
        System.out.println(map);


    }
}
