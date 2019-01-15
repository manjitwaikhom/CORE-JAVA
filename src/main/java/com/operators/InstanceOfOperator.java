package com.operators;

public class InstanceOfOperator {
	
	public static void main(String arg[]){

		String str="Hello";
		InstanceOfOperator t=new InstanceOfOperator();
		System.out.println(str instanceof String);
		System.out.println(str instanceof Object);
		System.out.println(str instanceof String);
		//System.out.println(t instanceof String); //compilation error
		}

}
