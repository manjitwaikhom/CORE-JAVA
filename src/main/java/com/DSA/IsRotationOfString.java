package com.DSA;

import java.util.*;

class IsRotationOfString{
public static void main(String as[]){
Scanner str1=new Scanner(System.in);
System.out.println("please enter the first string");
String string1=str1.nextLine();
System.out.println("please enter the second string");
String string2=str1.nextLine();




IsRotationOfString irs=new IsRotationOfString();
boolean b=irs.isRotation(string1,string2);
System.out.println(b);

}
boolean isRotation(String s1,String s2){
   return ((s1.length()==s2.length())&&(s1+s1).indexOf(s2)!=-1);
}
}