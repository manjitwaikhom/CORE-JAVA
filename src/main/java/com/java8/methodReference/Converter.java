package com.java8.methodReference;

@FunctionalInterface
public interface Converter <F,T>{
	T convert(F from);
}
