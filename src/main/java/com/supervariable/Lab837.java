package com.supervariable;


public class Lab837 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Hello().show();

	}

}
class Hai1{}
class Hello4 extends Hai{
	static int a=20;
	void show(){
		
		System.out.println(this);
		//System.out.println(super);
	}
}