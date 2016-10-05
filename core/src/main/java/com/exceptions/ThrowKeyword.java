package com.exceptions;
/*------EXAMPLE USING THROW KEYWORD--------*/
import java.io.*;
import java.sql.*;

class AException extends IOException{
}
/*----------------------------------*/
class ThrowDemo{
void m1(int x)throws IOException,ArithmeticException{
if(x==1){
throw new IOException();
}
}
}
class Hai extends ThrowDemo{
//ok
public void m1(int x){
System.out.println("Hai-m1");
}

/*ok
public void m1(int x)throws IOException.ArithmeticException{
System.out.println("Hai-m1");
}
*/

/*ok
public void m1(int x)throws AException.ArithmeticException{
System.out.println("Hai-m1");
}
*/

/*not ok
public void m1(int x)throws Exception.ArithmeticException{
System.out.println("Hai-m1");
}
*/

/*not ok
public void m1(int x)throws AException.ArithmeticException,SQLException{
System.out.println("Hai-m1");
}
*/
}

/*-------------------------------main()--------------------------*/
class ThrowKeyword{
public static void main(String as[])throws IOException,ArithmeticException{
	ThrowDemo h=new ThrowDemo();
h.m1(1);
}
}


