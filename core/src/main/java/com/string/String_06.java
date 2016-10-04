package com.string;
public class String_06{
public static void main(String as[]){
String str="mjtindiamjt";
byte b[]=new byte[15];
b=str.getBytes();
for(int i=0;i<b.length;i++){
System.out.println((char)b[i]+"...");
}
}
}