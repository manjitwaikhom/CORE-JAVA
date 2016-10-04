package com.classloader;

public class ClassLoadUsingForName {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.classloader.Hello");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

}
