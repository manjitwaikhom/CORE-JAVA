package com.java8.constructorReference;

/**
 * @author manjit
 *
 */
public class Person {
	String firstName;
    String lastName;

    Person() {
    	System.out.println("{}");
    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Person(String firstName, String lastName)");
    }
}
