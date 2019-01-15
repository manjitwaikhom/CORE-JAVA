package com.blocks;

class Hello2{
{
System.out.println("***Hello class Instance block***");
}
static{
System.out.println("***Hello class static block***");
}
Hello2(){
System.out.println("***Hello class constructor***");
}
}
/************************************/
class Bye extends Hello2{
int ab;
String st;
void show(){
System.out.println("---show() method---");
System.out.println(ab+"\t"+st);
}
Bye(int ab,String st){
System.out.println("*****Bye Class constructor*****");
this.ab=ab;
this.st=st;
}
{
System.out.println("***Bye class Instance block-1***");
System.out.println(ab+"\t"+st);
ab=20;
st="manjit";
}
Bye(){
System.out.println("***Bye class constructor****");
}
{
System.out.println("***Bye class Instance block-2***");
System.out.println(ab+"\t"+st);
ab=40;

{System.out.println("Local Block in instance block");}
st="singh";
}
static{
System.out.println("***Bye class Static block***");
}
}
/***********************************************/
class InstanceAndStaticBlocksM{
public static void main(String[] arg){

Bye b1=new Bye();
Bye b2=new Bye(12,"singh");
b2.show();
}
}































