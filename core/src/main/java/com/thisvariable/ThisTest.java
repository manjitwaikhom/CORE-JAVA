package com.thisvariable;

class Hello
{

    int ab;
    static int xy = 8574;

    void show()
    {
        String s = "Local";
        boolean flag = true;
        System.out.println(this);
        System.out.println("ab\t" + s);
        Hello h1 = new Hello();
        System.out.println("h1.ab---\t" + h1.ab);
        System.out.println("this.ab\t" + this.ab);
        System.out.println("xy\t" + flag);
        System.out.println("this.xy\t" + this.xy);
        System.out.println("Hello.xy\t" + Hello.xy);
        Hello h = this;
        System.out.println("h.ab\t" + h.ab);
        h = new Hello();
        final Hello h2 = new Hello();
	//h2=null;
	//this=null;
	//this();
    }

    static void display()
    {	//System.out.println(ab);
	//System.out.println(this);
	//System.out.println(this.ab);
	//System.out.println(this.xy);
        System.out.println(Hello.xy);
    }

}
class ThisTest{
public static void main(String arg[]){
Hello h1=new Hello();
System.out.println(h1);
h1.ab=777;
Hello h2=new Hello();
h2.ab=888;
Hello h3=new Hello();
h3.ab=999;
h1.show();
h2.show();
h3.show();
}
}
/*
output:--
Hello@19821f
Hello@19821f
ab      Local
h1.ab   0
this.ab 777
xy      true
this.xy 8574
Hello.xy        8574
h.ab    777
Hello@addbf1
ab      Local
h1.ab   0
this.ab 888
xy      true
this.xy 8574
Hello.xy        8574
h.ab    888
Hello@42e816
ab      Local
h1.ab   0
this.ab 999
xy      true
this.xy 8574
Hello.xy        8574
h.ab    999
*/