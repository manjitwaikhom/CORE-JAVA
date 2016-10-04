package com.thisvariable;

class HelloD{
int a;
HelloD(){
System.out.println("Hello class's zero argument constructor");
m3();
this.m3();
}
HelloD(int a){

System.out.println("Hello class's  one argument constructor");
this.a=a;
}
HelloD(int x,int y){
this();
System.out.println("Hello class's two argument constructor");
this.a=x+y;
}
void m1(){
System.out.println("m1 method");
int a=20;
System.out.println(a);
System.out.println(this.a);
}
void m2(){
System.out.println("m2 method");
System.out.println(a);
System.out.println(this.a);
m3();
this.m3();
}
static{
//System.out.println(this.a);
}
void m3(){
System.out.println("m3 method");
}
}
class ThisTestD{
public static void main(String arg[]){
HelloD h=new HelloD();
h.m1();
h.m2();

HelloD h2=new HelloD(100);
h2.m1();
h2.m2();

HelloD h3=new HelloD(200,300);
h3.m1();
h3.m2();

}
}

/*output:--
Hello class's zero argument constructor
m3 method
m3 method
m1 method
20
0
m2 method
0
0
m3 method
m3 method
Hello class's  one argument constructor
m1 method
20
100
m2 method
100
100
m3 method
m3 method
Hello class's zero argument constructor
m3 method
m3 method
Hello class's two argument constructor
m1 method
20
500
m2 method
500
500
m3 method
m3 method
*/