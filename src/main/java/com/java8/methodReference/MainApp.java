package com.java8.methodReference;

/**
 * @author manjit
 *
 */
public class MainApp {

	public static void main(String[] args) {
		//static method reference
		Sayable  sayable1=StaticMethodReference::saySomething;
		sayable1.say();
		
		
		//Object method reference
		InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
		Sayable sayable2 = instanceMethodReference::saySomething;
		sayable2.say();
		
		//Constructor reference
		Sayable sayable3=ConstructorReference::new;
		sayable3.say();
		
		

	}

}
