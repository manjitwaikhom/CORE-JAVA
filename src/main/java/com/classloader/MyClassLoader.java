package com.classloader;

public class MyClassLoader {
	 public static void main(String[] args){

		    ClassLoader classLoader = MyClassLoader.class.getClassLoader();

		    try {
		        Class aClass = classLoader.loadClass("com.classloader.Hello");
		        System.out.println("aClass.getName() = " + aClass.getName());
		    } catch (ClassNotFoundException e) {
		        e.printStackTrace();
		    }

}
}