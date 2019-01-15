package com.java8.constructorReference;

/**
 * @author manjit
 *
 */
public class MainApp {

	public static void main(String[] args) {
		PersonFactory<Person> personFactory = Person::new;
		Person person = personFactory.create("Peter", "Parker");

	}

}
