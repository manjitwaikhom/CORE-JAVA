package com.callbyvaluecallbyreference;

class CallByValueAndRef{
public static void main(String arg[]){
Hello h=new Hello();
h.ab=123;
System.out.println("*****primitive******");
System.out.println("Inside main before calling the method \t:"+h.ab);
ValueModifier.changeValue(h.ab);
System.out.println("Inside main after calling the mathod \t:"+h.ab);
System.out.println("*******Reference******");
System.out.println("Inside main before calling the method \t:"+h.ab);
ValueModifier.changeValue(h);
System.out.println("Inside main after calling the method \t:"+h.ab);

final Hello h1=new Hello();
h1.ab=234;
System.out.println(h1.ab+"\t"+h1.xy);
//h1.xy=78;
//h1=new Hello();
}
}

/******************************************************/
class Hello{
int ab;
final long xy=10;
}
/******************************************************/
class ValueModifier{
static void changeValue(int ab){
System.out.println("----changeValue(int) called ------");
System.out.println("before modifying\t:"+ab);
ab=ab+234;
System.out.println("after modifying\t:"+ab);
}

static void changeValue(Hello h){
System.out.println("----changeValue(Hello h) called ------");
System.out.println("before modifying\t:"+h.ab);
h.ab=h.ab+100;
System.out.println("after modifying\t:"+h.ab);
h=new Hello();
h.ab=85749;
System.out.println("after modifying the reference\t:"+h.ab);

}

}

/*Output:---
*****primitive******
Inside main before calling the method   :123
----changeValue(int) called ------
before modifying        :123
after modifying :357
Inside main after calling the mathod    :123
*******Reference******
Inside main before calling the method   :123
----changeValue(Hello h) called ------
before modifying        :123
after modifying :223
after modifying the reference   :85749
Inside main after calling the mathod    :223
234     10
*/




















