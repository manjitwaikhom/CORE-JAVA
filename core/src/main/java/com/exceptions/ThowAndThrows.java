package com.exceptions;
/*----EXAMPLE USING THROW AND THROWS-----*/

class ThrowAndThrows{
void m1() throws Error{
System.out.println("Hello-m1");
}
void m2() throws Throwable{
System.out.println("Hello-m2");
}
void m4(){
System.out.println("Hello-m4");
throw new Error();
}
void m3(){
System.out.println("Hello-m3");
try{
System.out.println("try-begin");
throw new Error();
//System.out.println("try-end");
}catch(Error err){
System.out.println("in m3:catch block");
err.printStackTrace();
System.out.println(err.getMessage());
}
System.out.println("m3-end");
}
}

/*----------------------------------------------------------*/

class ExThrowAndThrows extends ThrowAndThrows{
/*
public void m1() throws Exception{
System.out.println("Hai-m1");
}
void m2() throws Exception{
System.out.println("Hai-m2");
*/
void m2() throws Error{
System.out.println("Hai-m2");
}
public void m1() throws Error{
System.out.println("Hai m1");
}
}

/*----------------------------------------------------------------*/

class ThowAndThrows{
public static void main(String as[]){
try{
	ThrowAndThrows h=new ExThrowAndThrows();
h.m1();
h.m2();
h.m3();
}catch(Throwable t){
t.printStackTrace();
System.out.println("In main: catch block");
}
System.out.println("main end");
}
}

