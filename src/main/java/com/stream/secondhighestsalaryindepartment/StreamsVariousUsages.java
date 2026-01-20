package com.stream.secondhighestsalaryindepartment;


import java.util.*;
import java.util.stream.Collectors;



public class StreamsVariousUsages {
    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "Yanksha", 28, 10000, "F", "HR", "Blore", 2020));
        empList.add(new Employee(2, "Francesca", 29, 12000, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "Ramesh", 30, 13000, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "Melanie", 32, 15000, "F", "HR", "Chennai", 2013));

        empList.add(new Employee(5, "Padma", 22, 20000, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "Milad", 27, 25000, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "Uzma", 26, 26000, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "Ali", 23, 27000, "M", "IT", "Trivandam", 2015));
        empList.add(new Employee(9, "Ram", 25, 28000, "M", "IT", "Blore", 2010));


        //Second Highest salary in the organization
        Employee secondHighest = empList.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).skip(1).findFirst().get();
        System.out.println("Second Highesr salary in the organization");
        System.out.println(secondHighest);

        System.out.println("\n\n");


        //Second Highest salary in each department
        Map<String,Employee> secondHighestinDept =empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.collectingAndThen(
                Collectors.toList(),list-> list.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).skip(1).findFirst().get())));
        System.out.println("Second Highesr salary in each department");
        System.out.println(secondHighestinDept);




        //Group the Employees by city
        Map<String, List<Employee>> empByCity;
        empByCity = empList.stream().collect(Collectors.groupingBy(Employee::getCity));
        System.out.println("Employees grouped by city :: \n");
        empByCity.keySet().stream().forEach(key -> System.out.println(key+"-"+empByCity.get(key)));
        //-Group the Employees by city

        System.out.println("\n\n");

        //Group employee by department
        Map<String,List<Employee>> empByDept;
        empByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName));
        System.out.println("Employees grouped by depertment :: \n");
        empByDept.keySet().stream().forEach(key -> System.out.println(key +"-"+empByDept.get(key)) );
        //-Group Employee by department

        System.out.println("\n\n");
        //Group employee by gender
        Map<String, List<Employee>> empByGender;
        empByGender = empList.stream().collect(Collectors.groupingBy(Employee::getGender));
        System.out.println("Employees grouped by Gender :: \n");
        empByGender.keySet().stream().forEach(key -> System.out.println(key+"-"+empByGender.get(key)));

        System.out.println("\n\n");
       // Group the Employees by age.
        Map<Integer ,List<Employee>> empByAge;
        empByAge = empList.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println("Employees grouped by Age :: \n");
        empByAge.keySet().stream().forEach(key -> System.out.println(key+"-"+empByAge.get(key)));
        //-Group the Employees by age.

        System.out.println("\n\n");
        //Find the count of male and female employees present in the organization.
        Map<String, Long> noOfMaleAndFemaleEmployees = empList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("Count of male and female employees present in the organization:: \n" + noOfMaleAndFemaleEmployees);

        System.out.println("\n\n");
        //Find the count of male and female present in each department
        Map<String,Map<String,Long>> mfEmpEachdept;
        mfEmpEachdept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.groupingBy(Employee::getGender,Collectors.counting())));
        System.out.println("male and female count in each dept::" + mfEmpEachdept);

        System.out.println("\n\n");
        //Print the names of all distinct departments in the organization.
        System.out.println("Distinct Departments::");
        empList.stream().map(Employee::getDeptName).distinct().forEach(dept -> System.out.println(dept));

        System.out.println("\n\n");
        //employee details whose age is greater than 28 in the organisation.
        System.out.println("Employee details whose age is greater than 28 in the organisation");
        empList.stream().filter(emp -> emp.getAge() > 28).forEach(emp -> {System.out.println(emp);});

        System.out.println("\n\n");

        //Find maximum age/oldest of employee in the organisation.
        System.out.println("maximum age/oldest of employee in the organisation");
        Optional<Employee> oldestEmpOpt = empList.stream().max(Comparator.comparingInt(Employee::getAge));
        Employee emp = oldestEmpOpt.get();
        System.out.println(emp);

        System.out.println("\n\n");
        //Print Average age of Male and Female Employees in the organisation.
        Map<String, Double> avgAge = empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        System.out.println(avgAge);


        System.out.println("\n\n");
        //Print the number of employees in each department.
        Map<String,Long> empCountEachDept=empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));
        System.out.println("number of employees in each department.");
        empCountEachDept.keySet().stream().forEach(key -> System.out.println(key+"-"+empCountEachDept.get(key)));

        System.out.println("\n\n");
        //11. Find longest serving employees in the organization.
        Optional<Employee> longestServing = empList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining));
        Employee longestServingEmp= longestServing.get();
        System.out.println("longest serving employee.");
        System.out.println(longestServingEmp);

        Optional<Employee> seniorEmp = empList.stream().sorted(Comparator
                .comparingInt(Employee::getYearOfJoining)).findFirst();
        System.out.println("Longest-serving employee:" + seniorEmp.get());

        System.out.println("\n\n");
        //12.Find longest serving employee in each department
        System.out.println("longest serving employee in each department");
        empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.minBy(Comparator.comparingInt(Employee::getYearOfJoining))))
                .forEach((key,value) -> System.out.println(key+"-"+value.get().getName()+"-"+value.get().getYearOfJoining()));





    }

}


