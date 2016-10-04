package com.wrapper;
/*-----CONVERTING PRIMITIVE TO/FROM WRAPPER CLASS-----------*/
class PrimitiveToWrapperAndViceVersa{
public static void main(String[] as){

//1.Converting primitive to wrapper object
int a=99;
Integer i1=new Integer(a);
double d=99.99;
Double d1=new Double(99.99);

//2.converting wrapper object to primitive
byte by=10;
Byte b=new Byte(by);

byte b1=b.byteValue();
short s1=b.shortValue();
int x=b.intValue();
long l=b.longValue();
float f=b.floatValue();
double d2=b.doubleValue();

Integer i=new Integer(100);
b1=i.byteValue();
s1=i.shortValue();
x=i.intValue();
l=i.longValue();
f=i.floatValue();
d2=i.doubleValue();

//3.converting String to Primitive
String s="111";
x=Integer.parseInt(s);
d2=Double.parseDouble(s);



//4.Converting String to Wrapper object
String s2="222";
Integer i4=new Integer(s2);
Integer i5=Integer.valueOf(s2);
Double d4=new Double(s2);
Double d5=Double.valueOf(s2);


//5.converting Primitive to string
int ss=123;
String s3=String.valueOf(ss);
String s4=Integer.toString(ss);

//6.Converting Wrapper object to String
Integer ii=new Integer(100);
String s5=ii.toString();



}



}















































