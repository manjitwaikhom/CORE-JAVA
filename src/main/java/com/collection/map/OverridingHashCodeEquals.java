package com.collection.map;

import java.util.HashMap;


public class OverridingHashCodeEquals {

    public static void main(String[] args) {
	HashMap<Person,String> personMap=new HashMap<>();
	personMap.put(new Person("a"),"apple");
	personMap.put(new Person("b"), "bat");
	personMap.put(new Person("a"), "apple");
	
	System.out.println(personMap.size());

    }

}

//

class Person{
    String name;
    
    
    public Person(String name) {
	super();
	this.name = name;
    }


    @Override
    public int hashCode() {
    return 7;
    }
    
    @Override
    public boolean equals(Object obj) {
	return true;
    }
    
}
