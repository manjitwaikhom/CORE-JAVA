package com.java8.lambdaexpression;

@FunctionalInterface
public interface Converter <F,T>{
	T convert(F from);
}
