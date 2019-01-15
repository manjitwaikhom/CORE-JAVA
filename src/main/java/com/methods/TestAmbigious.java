package com.methods;

class Hello{
static void showValue(int ab,byte b1){
System.out.println("int, byte");
}
static void showValue(byte b1,int b2){
System.out.println("byte,int");
}
}
class TestAmbigious{
public static void main(String arg[]){
byte by1=10;
//Hello.showValue(10,20);
//Hello.showValue(10,by1);
//Hello.showValue(by1,10);
//Hello.showValue(by1,by1);

}
}