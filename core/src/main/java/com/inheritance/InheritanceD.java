package com.inheritance;

class Parent{
int a=10;
int b=20;
void m1(){
System.out.println("m1 method");
System.out.println(a);
System.out.println(b);
//System.out.println(x);
//System.out.println(y);
}
}
class Son extends Parent{
int x=30;
int y=40;
void m2(){
System.out.println("m2 method");
System.out.println(a);
System.out.println(b);
System.out.println(x);
System.out.println(y);
}
}
class InheritanceD{
public static void main(String arg[]){
Parent p=new Parent();
p.m1();
//p.m1();
Son s=new Son();
s.m1();
s.m2();
}
}