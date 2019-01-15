package com.string;

/*-----STRING(string pool)-------*/
public class StringPool{
public static void main(String as[]){
String s1="manjit";
String s2=new String("manjit");
String s3=s1.intern();


System.out.print("s1==s2....." );
System.out.println(s1==s2);
System.out.println("s1.equals(s2)...."+s1.equals(s2));

}
}

