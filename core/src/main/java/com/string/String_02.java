package com.string;
class String_02{
public static void main(String as[]){
String st1="abc";
String st2="aBc";
String st3="abc";

System.out.println("st1.compareTo(st2)");
System.out.println(st1.compareTo(st2));

System.out.println("st2.compareTo(st1)");
System.out.println(st2.compareTo(st1));

System.out.println("st1.compareTo(st3)");
System.out.println(st1.compareTo(st3));

System.out.println("st1.compareToIgnoreCase(st2)");
System.out.println(st1.compareToIgnoreCase(st2));

System.out.println("st2.compareToIgnoreCase(st1)");
System.out.println(st2.compareToIgnoreCase(st1));

System.out.println("st2.compareToIgnoreCase(st3)");
System.out.println(st2.compareToIgnoreCase(st3));

System.out.println("st1.equals(st2)");
System.out.println(st1.equals(st2));

System.out.println("st2.equals(st1)");
System.out.println(st2.equals(st1));

System.out.println("st1.equals(st3)");
System.out.println(st1.equals(st3));

System.out.println("st1.equalsIgnoreCase(st2)");
System.out.println(st1.equalsIgnoreCase(st2));

System.out.println("st2.equalsIgnoreCase(st1)");
System.out.println(st2.equalsIgnoreCase(st1));

System.out.println("st1.equalsIgnoreCase(st3)");
System.out.println(st1.equalsIgnoreCase(st3));

String str="mjtindiamjt";
System.out.println(str);
System.out.println("str.indexOf(mjt)");
System.out.println(str.indexOf("mjt"));

System.out.println("str.lastIndexOf(mjt)");
System.out.println(str.lastIndexOf("mjt"));

System.out.println("str.indexOf(mjt,2)");
System.out.println(str.indexOf("mjt",2));

System.out.println("str.lastIndexOf(mjt,6)");
System.out.println(str.lastIndexOf("mjt",6));

System.out.println("str.startsWith()");
System.out.println(str.startsWith("mjt"));

System.out.println("str.startsWith()");
System.out.println(str.startsWith("sri"));

System.out.println("str.endsWith()");
System.out.println(str.endsWith("mjt"));

System.out.println("str.endsWith()");
System.out.println(str.endsWith("sri"));
}
}








