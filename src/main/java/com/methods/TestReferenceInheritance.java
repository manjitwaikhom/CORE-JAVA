package com.methods;

class Hello3{
static void showValue(Object obj){
System.out.println("Object");
}

static void showValue(int arr[]){
System.out.println("int arr[]");
}

}

class TestReferenceInheritance{
public static void main(String arg[]){
Hello3.showValue("ok");
Hello3.showValue(new int[3]);
Hello3.showValue(null);
}

}