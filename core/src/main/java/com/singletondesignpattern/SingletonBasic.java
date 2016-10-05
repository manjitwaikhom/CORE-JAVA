package com.singletondesignpattern;


class SingletonBasic {

	public static void main(String[] args) {
		Single s1=Single.getInstance();
		
		Single s2=Single.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);

	}

}

class Single{
	static Single s=null;
	private Single(){}
	static{
		 s=new Single();
	}
	static Single getInstance(){
		return s;
	}
	
	
}