package com.string;
/*-----STRING--------*/
public class String_01{
public static void main(String[] as){
String str1="mjtindia";
String str2=new String("mjtindia");
String str3=str2.intern();
System.out.println(str1==str3);
String s1="mjt"+"india";
System.out.println(s1==str1);
String s2="mjt";
s2=s2+"india";
System.out.println(s2==str1);
String s3="india";
s3="mjt"+s3;
System.out.println(s3==str1);
String s4="mjt";
String s5="india";
String s6=s4+s5;
System.out.println(s6==str1);
String str="abc";
int x=str.hashCode();
System.out.println(x);
}
}
