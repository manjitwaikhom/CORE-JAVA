package com.stringbuffer;
/*----STRING BUFFER----------*/
class StringBuffer001{
public static void main(String[] as){
StringBuffer sb1=new StringBuffer();
System.out.println(sb1.length());
System.out.println(sb1.capacity());
StringBuffer sb2=new StringBuffer("mjt");
System.out.println(sb2.length());
System.out.println(sb2.capacity());
sb2.append("india12345678");
System.out.println(sb2.length());
System.out.println(sb2.capacity());
System.out.println(sb2);
String str1=new String("mjt");
String str2=new String("mjt");
StringBuffer sb=new StringBuffer("mjt");
System.out.println(str1.equals(str2));
System.out.println(str1.equals(sb));
System.out.println(sb.equals(str1));
System.out.println(str1.contentEquals(sb));

}


}















































