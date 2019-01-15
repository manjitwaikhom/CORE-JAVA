package com.runtimepolymorphism;

class Animal{
void eating(){
System.out.println("Animal eating");
}
void sleeping(){
System.out.println("Animal sleeping");
}
static void running(){
System.out.println("Animal running");
}
}
/********************************************/
class Dog extends Animal{
void eating(){
System.out.println("Dog eating");
}
static void running(){
System.out.println("Dog running");
}
void barking(){
System.out.println("Dog barking");
}
}
/******************************************/
class Cat extends Animal{
void eating(){
System.out.println("Cat eating");
}
static void running(){
System.out.println("Cat running");
}
void barking(){
System.out.println("Cat barking");
}
}
/*****************************************/
class Runtimetest{
public static void main(String as[]){
Animal a=null;
a=new Dog();
a.eating();
a.sleeping();
a.running();
//a.barking();
a=new Cat();
a.eating();
a.sleeping();
a.running();
//a.barking();
}
}
