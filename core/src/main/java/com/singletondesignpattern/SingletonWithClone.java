package com.singletondesignpattern;

class SingletonWithClone{

	public static void main(String[] args) {
		SingleExample s1=SingleExample.getInstance();
		
		SingleExample s2=SingleExample.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);

	}

}

class SingleExample implements Cloneable{
	static SingleExample s=null;
	private SingleExample(){}
	static{
		 s=new SingleExample();
	}
	static SingleExample getInstance(){
		return s;
	}
	
	
	@Override
	public Object clone(){
		
		try {
			throw new CloneNotSupportedException();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

return null;
}
		
	
}