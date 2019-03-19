package com.java8.defaultMethod;

public interface Formula {
	//abstract method
	double add(int a,int b);
	
	//default method introduced in java8
	default double sqrt(int b) {
		return Math.sqrt(b);
	}
}
