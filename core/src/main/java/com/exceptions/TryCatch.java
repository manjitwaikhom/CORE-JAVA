package com.exceptions;

class TryCatch{
public static void main(String as[]){
System.out.println("begin");


int a=Integer.parseInt(as[0]);
int x=0;
try{
 x=10/a;
}catch(ArithmeticException e){
System.out.println("I catched the exception using try");

}
System.out.println(x);
System.out.println("end");
}


}

