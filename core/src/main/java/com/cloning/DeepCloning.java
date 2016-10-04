package com.cloning;
/*--------------- DEEP CLONING-----------------------*/
class HelloC implements Cloneable{
int a;
C cobj;
HelloC(){}
HelloC(int a,C cobj){
this.a=a;
this.cobj=cobj;
}
void show(){
System.out.println(a);
System.out.println(cobj.q);
System.out.println(cobj.bobj.p);
System.out.println(cobj.bobj.aobj.x);
}
public Object clone(){
Hello h=null;
boolean flag=false;

try{
Class cls=Class.forName("Hello");//A call to forName("X") causes the class named X to be initialized.

Class c[]=cls.getInterfaces();//Returns the Class representing the component type of an array.  If this class does not                                                 //represent an array class this method returns null
for(int i=0;i<c.length;i++){
String inm =c[i].getName();
System.out.println(inm);
if(inm.equals("java.lang.Cloneable")){
flag=true;
}
}
if(flag){
A a1=new A(this.cobj.bobj.aobj.x);
B b1=new B(this.cobj.bobj.p,a1);
C c1=new C(this.cobj.q,b1);
h=new Hello(this.a,c1);
}else{
throw new CloneNotSupportedException("Hello");
}
}catch (Exception e){
System.out.println(e);
}
return h;
}
}
/*--------------------------main()-------------------------------------*/
class Lab5{
public static void main(String as[]){
A aobj=new A(10);
B bobj=new B(20,aobj);
C cobj=new C(30,bobj);
HelloC h=new HelloC(40,cobj);
h.show();
h.a=1000;
h.cobj.q=2000;
h.cobj.bobj.p=3000;
h.cobj.bobj.aobj.x=4000;
h.show();
HelloC h1=(HelloC)h.clone();
if(h1!=null){
h1.show();
System.out.println(h==h1);
System.out.println(h.cobj==h1.cobj);
System.out.println(h.cobj.bobj==h1.cobj.bobj);
System.out.println(h.cobj.bobj.aobj==h1.cobj.bobj.aobj);
}
}
}
