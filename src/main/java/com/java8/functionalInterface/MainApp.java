package com.java8.functionalInterface;

/**
 * @author manjit
 *
 */
public class MainApp {

	public static void main(String[] args) {
		Converter<String,Integer> converter=(from)-> Integer.valueOf(from);
		Integer integer=converter.convert("123");
		System.out.println(">> "+integer);

	}

}
