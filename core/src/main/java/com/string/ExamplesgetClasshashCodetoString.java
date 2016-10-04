package com.string;

/*-------------- EXAMPLE USING getClass(),hashCode() AND toString()---------------------*/

class A{
A(int a){
//super(a); Object class don't have one argument constructor.
super(); //Object class have default constructor.
}
}
/*------------------------------------------------------------------------------*/
class B extends A{
B(int a,int b){
super(a+b);
}
}
/*-------------------------------------------------------------------------------*/
class Hello{
int a=10;
int b=20;
int c=30;
public int hashCode(){
//your own algorithm to create hash Code number
return 99;
}
public String toString(){
return "[a="+a+",b="+b+",c="+c+"]";
}
}
/*-----------------------------------main----------------------------------------------------*/
class ExamplesgetClasshashCodetoString{
public static void main(String as[]){
Hello h=new Hello();
Class cls=h.getClass();
System.out.println(cls.getName());

System.out.println(h.hashCode());
System.out.println(h.toString());
System.out.println(h);
A obj=new B(10,20);
System.out.println("****************");
System.out.println(obj.getClass().getName());

System.out.println(obj.hashCode());
System.out.println(obj.toString());
System.out.println(obj);
}
}



















