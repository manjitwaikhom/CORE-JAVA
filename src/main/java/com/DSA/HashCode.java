package com.DSA;

public class HashCode {

    public static void main(String[] args) {
	System.out.println(new Book("richest man in babylon").hashCode());
	System.out.println(new Book("richest man in babylon").hashCode());
	System.out.println(new Book("richest man in babylon").hashCode());
    }

}

class Book{
    String name;

    public Book(String name) {
	super();
	this.name = name;
    }
    
    /*@Override
    public int hashCode() {
    return 1234;
    }*/
    
    
}
