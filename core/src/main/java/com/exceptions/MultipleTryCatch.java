package com.exceptions;
/*---EXAMPLE USING  MULTIPLE TRY  AND CATCH BLOCKS-----*/
class MultipleTryCatch{
public static void main(String as[]){
System.out.println("main begin");
String s=null;
try{
s=as[0];
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("please provide the value");
System.out.println(e);
}
int x=0;
try{
x=Integer.parseInt(s);
System.out.println(x);
}
catch(NumberFormatException e){
System.out.println("please provide integer number");
System.out.println(e);
}
try{
int y=10/x;
System.out.println(y);
}
catch(ArithmeticException e){
System.out.println("please do not provide zero");
System.out.println(e);
}
System.out.println("main end");
}
}

