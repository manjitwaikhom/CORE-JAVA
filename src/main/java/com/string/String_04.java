package com.string;
/*----STRING-------*/
public class String_04{
public static void main(String as[]){
String str="mjtindiamjt";
System.out.println(" ");
System.out.println("str.charAt(3)");
System.out.println(str.charAt(3));
System.out.println("str.indexOf('i')");
System.out.println(str.indexOf('i'));
System.out.println("str.lastIndexOf('i')");
System.out.println(str.lastIndexOf('i'));
System.out.println("str.indexOf('i',4)");
System.out.println(str.indexOf('i',4));
System.out.println("str.lastIndexOf('i',4)");
System.out.println(str.lastIndexOf('i',4));

String s3="   123   abc    ";
System.out.println(s3);
System.out.println(s3.length());
s3=s3.trim();
System.out.println("trim()");
System.out.println(s3);
System.out.println(s3.length());
System.out.println(str);
String str1=str.replace('i','X');
System.out.println(str);
System.out.println(str1);
System.out.println("*****");
String str2=str.substring(3);
System.out.println(str2);
String str3=str.substring(3,8);
System.out.println(str3);
}
}


