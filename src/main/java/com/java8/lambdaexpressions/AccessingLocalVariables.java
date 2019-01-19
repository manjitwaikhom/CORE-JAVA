package com.java8.lambdaexpressions;

public class AccessingLocalVariables{
	public static void main(String[] args) {
		//final int num = 1;
		int num = 1;
		Converter<Integer, String> stringConverter =
		        (from) -> String.valueOf(from + num);

		String str=stringConverter.convert(2);
		System.out.println(">>> "+str);
		
	}
	
}
