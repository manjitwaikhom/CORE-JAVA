package com.string;

/*-----STRING(string pool)-------*/
/*Whenever we create a String Object, two objects will be created i.e. One in the Heap Area and
One in the String constant pool and the String object reference always points to heap area object.
When String s2=new String("manjit") execute, it will create two objects and pointing to the heap 
area created object.*/
public class StringPool{
public static void main(String as[]){
String s1="manjit";
String s2=new String("manjit");
String s3=s1.intern();


System.out.println("s1==s2: " +s1==s2);
System.out.println("s1.equals(s2):"+s1.equals(s2));

}
}

