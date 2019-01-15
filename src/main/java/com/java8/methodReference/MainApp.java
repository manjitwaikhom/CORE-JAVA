package com.java8.methodReference;

/**
 * @author manjit
 *
 */
public class MainApp {

	public static void main(String[] args) {
		//static method reference
		Converter<String,Integer> converter1=Integer::valueOf;
		Integer integer=converter1.convert("123");
		System.out.println(">static> "+integer);
		
		//Object method reference
		Something something=new Something();
		Converter<String, String> converter2 = something::startsWith;
		String converted = converter2.convert("Java");
		System.out.println(">object> "+converted); 
		
		
		

	}

}
