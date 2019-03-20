package com.singletondesignpattern;


class SingletonBasic {

	public static void main(String[] args) {
		Single singleton1=Single.getInstance();
		
		Single singleton2=Single.getInstance();
		System.out.println(singleton1);
		System.out.println(singleton2);
		System.out.println(singleton1==singleton2);

	}

}

class Single{
	//Early instance will be created at load time  
	private static Single singleton=new Single();
	private Single(){}
	
	static Single getInstance(){
		return singleton;
	}
	
	
}

class SingletonLazy{
	
	private static SingletonLazy singleton;
	
	private SingletonLazy() {}
	
	
	 public static SingletonLazy getInstanceLazy(){  
		   if (singleton == null){  
		      synchronized(SingletonLazy.class){  
		        if (singleton == null){  
		        	singleton = new SingletonLazy();//instance will be created at request time  
		        }  
		    }              
		    }  
		  return singleton;  
		 }  
}