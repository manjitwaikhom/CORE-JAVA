package com.singletondesignpattern;

import java.io.Serializable;

public class SingletonWithSerialization {

	public static void main(String[] args) {
		
		SingletonSerializeSafe single1=SingletonSerializeSafe.getInstance();
		SingletonSerializeSafe single2=SingletonSerializeSafe.getInstance();
		System.out.println(single1==single2);
		

	}

}

class SingletonSerializeSafe implements Serializable{
	
	private static SingletonSerializeSafe  singleton=new SingletonSerializeSafe();
	private  SingletonSerializeSafe() {}
	
	public static SingletonSerializeSafe getInstance() {
		return singleton;
	}
	
	protected Object readResolve() { 
		 System.out.println("readResolve()");
         return getInstance();  
     }  
}
