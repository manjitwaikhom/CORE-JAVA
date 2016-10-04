package com.methods;
class Adder{
static void add(int ab,byte b1){
System.out.println("add(int,byte)");
System.out.println(ab+b1);
}
 void add(int ab,int b1){
System.out.println("add(int,int)");
System.out.println(ab+b1);
}
static String add(String str,long ab){
System.out.println("add(String,long)");
return str+ab;
}
String add(String str,String str2){
System.out.println("add(String,String)");
return str+str2;
}
}
class MethodOverLoading{
public static void main(String args[]){
Adder ad=new Adder();
ad.add(12,34);
Adder.add(12,(byte)34);
byte by1=89;
Adder.add(12,by1);
ad.add('A','B');
ad.add("A","B");
ad.add("st",'B');
//ad.add("ok",20.0f);
}
}

/*
output:-
add(int,int)
46
add(int,byte)
46
add(int,byte)
101
add(int,int)
131
add(String,String)
add(String,long)*/