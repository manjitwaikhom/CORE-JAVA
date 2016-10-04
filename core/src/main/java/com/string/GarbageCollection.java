package com.string;
/*-------- GARBAGE COLLECTION-------------*/
class GarbageCollection{
public static void main(String as[]){
Student s1=new Student(12,"manjit");
Student s2=new Student(13,"waikhom");
Student s3=new Student(14,"singh");
Student s4=new Student(12,"manjit");
Student s5=new Student(12,"manjit");
System.runFinalization();
System.gc();
s2=s1;
System.gc();
s3=null;
s4=new Student(78,"waikhom");
m1();
System.runFinalization();
System.gc();
}
public static void m1(){
Student s1=new Student(45,"manjitwaikhomsingh");
Student s2=new Student(45,"manjitwaikhomsingh");
}
}
/*-----------------------------------------------------------------------------*/
class Student{
int sid;
String sname;
public Student(int sid,String name){
this.sid=sid;
this.sname=sname;
}
public void finalize(){
System.out.println("in finalize(): resource released");
}
}

