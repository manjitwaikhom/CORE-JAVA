package com.blocks;
/* Instance Blocl*/
/* Static Block*/


class Hello1{
int a=0;
static int b=20;
{
System.out.println(" Instance B");

System.out.println(a);

System.out.println(b);
}

static {

	System.out.println("Static B");
	//System.out.println(a);
	System.out.println(b);
}
	}

class InstanceBlockStaticBlock{

public static void main(String arg[]){

Hello1 h=new Hello1();
}
}


