package com.exceptions;
/*---EXAMPLE USING SINGLE TRY AND CATCH BLOCKS---*/
class HelloWorld{
public static void main(String as[]){
System.out.println("begin");

int a=Integer.parseInt(as[0]);

int x=10/a;

System.out.println(10/0);


System.out.println("end");
}

}
