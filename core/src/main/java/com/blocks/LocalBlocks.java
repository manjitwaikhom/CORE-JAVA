package com.blocks;

class Hello{
int s;
{
System.out.println("I.B of hello");
int a=10;



{
System.out.println("local block");
int x=20;
System.out.println(x);
System.out.println(a);
}
System.out.println(a);
}

static{
System.out.println("static block");
int a=1;
{
System.out.println("L.B of static");
int x=20;
System.out.println(x);
System.out.println(a);
}
System.out.println(a);
}


Hello(){
System.out.println("constructor of hello");
int a=10;
{
System.out.println("local block of constructor");
int x=20;
System.out.println(x);
System.out.println(a);
}
}


void show(){
System.out.println("show method");
int a=10;


{
System.out.println("local blockof show");
int x=20;
System.out.println(x);
System.out.println(a);
}
System.out.println(a);
}
}


public class LocalBlocks {
	public static void main(String as[]){
		int p=10;
		Hello h=new Hello();
		h.show();
		}
}
