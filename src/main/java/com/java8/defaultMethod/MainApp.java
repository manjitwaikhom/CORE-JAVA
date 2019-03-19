package com.java8.defaultMethod;

public class MainApp {

	public static void main(String[] args) {
		Formula formula=new Formula(){
			@Override
			public double add(int a,int b) {
				return a+b;
			}
			
		};
		
		double addResult=formula.add(1, 2);
		System.out.println("Addition Result: "+addResult);
		
		//invoking default method introduced in java8
		double sqrtResult=formula.sqrt(4);
		System.out.println("Square root result: "+sqrtResult);

	}

}
