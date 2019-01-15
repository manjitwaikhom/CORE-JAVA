package com.stringbuffer;
class StringBuffer002{
public static void main(String[] as){
StringBuffer sb2=new StringBuffer("mjt");
System.out.println(sb2.length());
System.out.println(sb2.capacity());
System.out.println(sb2);
//sb2.setCharAt(8,'9');
System.out.println(sb2);
int x=99;
sb2.append(x);
System.out.println(sb2);
sb2.insert(3,99.99);
sb2.insert(18,"abc");
System.out.println(sb2);
sb2.delete(3,8);
System.out.println(sb2);
sb2.deleteCharAt(8);
System.out.println(sb2);
sb2.reverse();
System.out.println(sb2);
System.out.println(sb2.capacity());
System.out.println(sb2.length());
//sb2.insert(26,"abcd1234");


}

}