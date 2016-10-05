package com.exceptions;
/*----EXAMPLE USING TRY, CATCH AND FINALLY BLOCKS----*/
class Hello{
int m1(String s){
try{
int x=Integer.parseInt(s);
int y=10/x;
System.out.println(y);
//System.exit(0);
return y;
}
catch(Exception e){
System.out.println(e);
}
finally{
System.out.println("Resource clean up can be done here-prefer me than finalize() method");
System.out.println("i am ok");
}
System.out.println("i am not ok");
return 99;
}
void m2(){
try{
int x=10/0;
}
finally{
System.out.println("i am inside finally");
}
System.out.println("i am outside finally");
}
}
/*-------------------------main()---------------------------*/
class TryCatchFinally{
public static void main(String as[]){
System.out.println("main begun");
Hello h=new Hello();
int s=h.m1(as[0]);
h.m2();
System.out.println(s);
System.out.println("main end");
}
}

