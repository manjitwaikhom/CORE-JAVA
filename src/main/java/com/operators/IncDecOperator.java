package com.operators;

public class IncDecOperator {
	public static void main(String[] args) {
		int x=10;
		System.out.println("x: "+x);//10
		int a=++x;
		System.out.println("++x: "+a);//11
		int b=--x;
		System.out.println("--x: "+b);//10
		int c=x++;
		System.out.println("x++: "+c);//10
		int d=x--;
		System.out.println("x--: "+d);//11
		int e=++x;
		System.out.println("++x: "+e);//11
		int f=++x;
		System.out.println("++x: "+f);//12
		int g=x++;
		System.out.println("x++: "+g);//12
		
		
	}

}
