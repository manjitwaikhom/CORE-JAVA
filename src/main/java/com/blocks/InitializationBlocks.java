package com.blocks;
class InitializationBlocks{
int a;
static int b;
{
System.out.println("Hello instant block");
System.out.println(a);
System.out.println(b);
}

static{
System.out.println("static-hello");
System.out.println(b);
}


InitializationBlocks(int x){
a=x;
}

InitializationBlocks(int x,int y){
a=x;
b=y;
}

void show(){
System.out.println(a);
System.out.println(b);
}
}


class Lab6{
int x;
static int y;
{
System.out.println("ib");
System.out.println(x);
System.out.println(y);
}
static{
System.out.println("Lab6 -sb");
System.out.println(y);
}
public static void main(String as []){

InitializationBlocks h=new InitializationBlocks(100,200);
h.show();
}
}