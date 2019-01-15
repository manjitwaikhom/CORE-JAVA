package com.java8.constructorReference;

/**
 * @author manjit
 *
 */
interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}
