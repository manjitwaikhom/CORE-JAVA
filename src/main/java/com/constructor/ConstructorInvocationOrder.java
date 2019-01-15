package com.constructor;

class Person{
int a;
Person(){
System.out.println("Constructor of Person class");
}

}
/*****************************/
class Teacher extends Person{
int b;
Teacher(){
System.out.println("Constructor of Teacher class");
}

}
/*****************************/
class Student3 extends Teacher{
int b;
Student3(){
System.out.println("Constructor of Student class");
}

}
/*****************************/
class ConstructorInvocationOrder extends Student3{
public static void main(String arg[]){
Student3 st=new Student3();


}
}